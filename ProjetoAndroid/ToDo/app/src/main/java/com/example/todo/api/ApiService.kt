package com.example.todo.api

import com.example.todo.model.Categoria
import retrofit2.Response
import retrofit2.http.GET

// Aqui será colocados os verbos HTTP
interface ApiService {

    // Vamos passar em qual endPoint vai pegar a categoria
    @GET("categoria")
    // Criar metodo que vai retornar a listagem de categorias
    // A marcação suspend significa que iremos rodar a fun dentro de uma corrotina
    // Response é um objeto que vai trazer se a resposta (requisição)
    // que foi feita dentro da API foi um sucesso com a messagem que irá retornar
    // E vai armazenar dentro dela uma list Cotegoria
    suspend fun listCategoria(): Response<List<Categoria>>
}