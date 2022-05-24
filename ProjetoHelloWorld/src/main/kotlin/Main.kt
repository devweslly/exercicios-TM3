import POO.Cliente
import POO.Cliente2

fun main() {
    /*
    val wes = Cliente(
        nome = "weslly",
        idade = 30,
        cpf = "111.111.111-11",
        saldo = 2000.0
    )

    println("Nome: ${wes.nome}")
    println("Idade: ${wes.idade}")
    println("CPF: ${wes.cpf}")

    wes.mostraSaldo()
    wes.comprar(100)
    wes.mostraSaldo()
    */

    /*
    val aviao = Aviao()
    aviao.passageiros = 200
    println("Número de passageiros: ${aviao.passageiros}")
    aviao.assentos(150)
    */

    var julia = Cliente2(nome ="Julia", idade = 22, saldo = 10000.0)

    println(julia.nome)
    println(julia.idade)
    println(julia.saldo)

    julia.mostraInfo()
}