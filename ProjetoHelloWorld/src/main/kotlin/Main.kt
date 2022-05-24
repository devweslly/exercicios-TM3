import POO.Cliente
import POO.Cliente2

fun main() {

    //Estrutura do try...catch - Fazer o Tratamento de Erros dentro do nosso código
    try {
        val julia = Cliente2(nome = "", idade = 22, saldo = 10000.0)

        julia.mostraInfo()
        println("---------------------------------")
        julia.addItemCompra("Camisa")
        println("---------------------------------")
        julia.addItemCompra("Meia")
        println("---------------------------------")
        julia.addItemCompra("Tenis")
        println("---------------------------------")
        julia.addItemCompra("Livro")
        println("---------------------------------")
        julia.removeItemCompra("Tenis")
        println("---------------------------------")
        println("ITEM ERRADO")
        julia.removeItemCompra("Calça")
        println("---------------------------------")
        julia.mostraListaCompra()
    } catch (e: Exception) {
        println(e.message)
    }

}