package POO

class Cliente(
    // Atributos
    var nome: String,
    var idade: Int,
    val cpf: String,
    var saldo: Double,
) {
    // Métodos
    fun mostraSaldo(){
        println("Seu saldo é de R$ $saldo.")
    }

    fun comprar(qtda: Int){
        val gasto = qtda * 10.0

        if (gasto < saldo && gasto > 0){
            saldo -= gasto
            println("Compra de R$ $gasto realizada com sucesso =)")
        } else {
            println("Não é possível realizar a compra :/")
        }
    }
}