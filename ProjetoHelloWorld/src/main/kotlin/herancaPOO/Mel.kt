package herancaPOO

class Mel(nome: String, idade: Int, especie: String) : Animal(nome, idade, especie) {

    override fun som(tipo: String) {
        super.som(tipo)
    }

    fun correr() {
        println("$nome gosta muito de correr.")
    }
}