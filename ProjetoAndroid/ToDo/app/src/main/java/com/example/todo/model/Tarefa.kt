package com.example.todo.model

// O data class faz com que não precise se preocupar com os metodos
// getter e setter, toString (estarao sobrescreito)
data class Tarefa(
    var id: Long,
    var nome: String,
    var descricao: String,
    var responsavel: String,
    var data: String,
    var status: Boolean,
    var categoria: Categoria,
) {
}