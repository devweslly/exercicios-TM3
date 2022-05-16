import java.lang.Math.pow

// Criar uma calculadora de imc (sem usar os operadores lógicos)

fun main() {
    // Entrada de dados
    println("Diga o seu peso:")
    val peso = readLine()!!.toDouble()
    println("Diga a sua altura:")
    val altura = readLine()!!.toDouble()

    // Processamento
    val imc = peso / (pow(altura, 2.0))

    // Saida de dados
    println("O seu IMC é ${"%.2f".format(imc)}")

    if (imc in 20.0..25.0) {
        println("Você está lindo")
    } else if (imc in 25.0..30.0) {
        println("Você está gordinho")
    }
}