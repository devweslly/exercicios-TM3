package herancaPOO

class Flecha(nome: String, idade: Int, especie: String):Animal(nome, idade, especie) {

    override fun som(tipo: String) {
        super.som(tipo)
    }

    fun subirArvore(){
        println("$nome curte muito subir em árvores.")
    }
}