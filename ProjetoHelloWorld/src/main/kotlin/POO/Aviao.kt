package POO

class Aviao {
    // Atributos
    var passageiros = 0

    // Metodos
    fun decolar(){
        println("O avião está decolando!")
    }

    fun pousar(){
        println("O avião está pousando!")
    }

    fun assentos(valor: Int){
        if (valor <= passageiros){
            passageiros -= valor
            println("Existem $valor passageiros para este voo.")
            println("O número de assentos livres é $passageiros.")
            decolar()
        } else {
            println("A quantidade de assentos informadas está incorreta.")
            println("O avião não pode levantar voo.")
        }
    }
}