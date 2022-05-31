package herancaPOO

class Spirit(nome: String, idade: Int, especie: String) : Animal(nome, idade, especie) {

    override fun som(tipo: String) {
        super.som(tipo)
    }

    fun correr(){
        println("$nome se sente livre quando está correndo!")
    }
}