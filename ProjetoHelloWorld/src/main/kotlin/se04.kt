import kotlin.math.pow
import kotlin.math.sqrt

fun parImpar() {
    // Entrada de dados
    println("Entre com o primeiro numero:")
    val num1 = readLine()!!.toDouble()

    // Processamento
    // Pode fazer a conta direto na estrutura de seleção
    // (ocupa menos memoria)
    val par = num1 % 2
    val raiz = sqrt(num1)
    val quad = num1.pow(2)

    // Saida de dados - Estrutura de seleção
    if (par == 0.0){
        println("O número $num1 é par!")
        println("A raiz de $num1 é $raiz")
    } else {
        println("O número $num1 é impar!")
        println("O quadrado de $num1 é $quad")
    }
}