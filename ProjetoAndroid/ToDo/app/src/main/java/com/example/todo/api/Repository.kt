package com.example.todo.api

import com.example.todo.model.Categoria
import retrofit2.Response

// Esta é a classe de repositorio para utilizar a nossa  val api
// e criar automaticamente a instancia e recuperar os verbos para retonar a lista de categoria
class Repository {

    // Acessando a val api para já criar a instancia de retrofit e acessar os verbos da classe de serviço
    suspend fun listCategoria(): Response<List<Categoria>>{
        // Acessa RetrofitInstance - com api criamos a instancia de Retrofit - acessamos o metodo listCategoria()
        return RetrofitInstance.api.listCategoria()
    }

}