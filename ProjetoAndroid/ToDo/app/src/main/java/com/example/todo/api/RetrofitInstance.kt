package com.example.todo.api

import com.example.todo.util.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

// Objeto de Instancia do Retrofit
// Criamos como um objeto pq queremos criar a instancia
// do Retrofit uma vez dentro do projeto
object RetrofitInstance {

    // Para inicializar as variáveis toda vez que for utilizar este  objeto
    // e deixar estes dados disponíveis imediatamente quando quisermos acessar eles
    // usamos o by lazy {}.  Assim é possível inicializar tudo oq é possível dentro da variável
    // A val retrofit tem tudo oq precisa para instanciar o Retrofit
    private val retrofit by lazy {
        // objeto retrofit. Dentro da classe Builder é possivel contruir to-do o objeto
        Retrofit.Builder()
            // Pegar o link da API. Indicar qual classe de service ele vai pegar os metodos
            // Não vamos colocar o URL base da API. Vamos criar um arquivo de constantes para fazer isso para deixar algo mais seguro
            .baseUrl(Constants.BASE_URL)
            // O Gson vai pegar o objeto Json que trazemos da API e converter
            // para algo que Kotlin entenda
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    // A partir da val api ela vai criar a instancia do Retrofit com base na class ApiService para pegar os metodos
    val api: ApiService by lazy {
        // Dentro do create iremos retornar uma ApiService
        retrofit.create(ApiService::class.java)
    }
}