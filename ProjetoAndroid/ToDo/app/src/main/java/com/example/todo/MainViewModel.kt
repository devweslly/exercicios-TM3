package com.example.todo

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.todo.api.Repository
import com.example.todo.model.Categoria
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.Response
import java.time.LocalDate
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor (
    // injeção de dependencia
    private val repository: Repository
) : ViewModel() {

    // Criar as variáveis observaveis para pegar a resposta
    // do nosso metodos do repositório

    // Responsavel por guardar a resposta desta nossa categoria
    // MutableLiveData pq queremos dentro da MainViewModel mudar o
    // conteudo desta variavel constantemente conforme for atualizando a lista
    private val _myCategoriraResponse =
    // Queremos depis recuperar os dados desta nossa resposta la fora
        // dentro do nosso fragmentForm. E queremos proteger estes dados
        MutableLiveData<Response<List<Categoria>>>()

    // Vai pegar os dados _myCategoriraResponse para apenas
    // ter acesso aos dados e não mudar o conteudo interno
    val myCategoriaResponse: LiveData<Response<List<Categoria>>> = _myCategoriraResponse

    val dataSelecionada = MutableLiveData<LocalDate>()

    // Para pegar as requisições dentro da internet
    // Assim que a ViewMOdel for instanciada, sera criado a listCategoria
    init {
        //listCotegoria()
    }

    // Metodo responsável por trazer os dados do nosso repositório
    // Precisamos de uma instancia de repositorio (a forma correta é colocando no construtor)
    fun listCotegoria() {
        // Como foi marcado a fun como supend, vamos ter que executar o nosso metodo
        // dentro de uma corotina
        viewModelScope.launch {
            try {
                // Executando o método de maneira assincrona
                // Enquanto o app estiver trabalhando por traz das cortinas,
                // vamos ficar trazendo todos os dados do banco de maneira assincrona.
                // Que não vai impactar nos metodos que estamos utilizando
                val response = repository.listCategoria()
                _myCategoriraResponse.value = response
            } catch (e: Exception) {
                Log.d("Erro", e.message.toString())
            }
        }
    }
}