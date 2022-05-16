import kotlin.math.PI
import kotlin.math.pow

// Faça um programa em que o usuário digite o diâmetro de um círculo
// e calcule a área e o perímetro dele

fun exCirculo() {
    // Entrada de dados
    println("Entre com o diametro:")
    val diametro = readLine()!!.toDouble()

    // Processamento
    val raio = diametro / 2
    val perimetro = 2 * PI * raio
    val area = PI * raio.pow(2.0) // PI * raio * raio

    // Saida de dados
    println("Perimetro: ${"%.2f".format(perimetro)}")
    println("Area: ${"%.2f".format(area)}")
}