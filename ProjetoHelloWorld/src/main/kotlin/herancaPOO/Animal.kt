package herancaPOO

// O open indica que a classe pode ser herdada (ter filhas)
open class Animal(var nome: String, var idade:Int, var especie: String) {

    // O open indica que o método pode ser sobrescrito
    open fun som(tipo: String){
        println("O tipo de som que o $nome emite é $tipo")
    }

    // Poliformfismo
    // Sobrecarga de Métodos - Usar a mesma função com parâmetros diferentes
    // Sobrescrita - Utilizar uma função existente,
    // mas executando coisas diferentes quando ela for chamada
    fun som(){
        println("Qual som este animal emite?")
        val som = readln()
        println("O tipo de som que o $nome emite é $som")
    }
}