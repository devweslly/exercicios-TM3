package testCalculadora

import kotlin.math.pow
import kotlin.math.sqrt

class Calculadora() {

    // Companion Object - Atributos e métodos sem precisar instanciar uma classe
    companion object {
        fun soma(n1: Double, n2: Double) {
            val soma = n1 + n2
            println("$n1 + $n2 = $soma")
        }

        fun sub(n1: Double, n2: Double) {
            val sub = n1 - n2
            println("$n1 - $n2 = $sub")
        }

        fun mult(n1: Double, n2: Double) {
            val mult = n1 * n2
            println("$n1 * $n2 = $mult")
        }

        fun divisao(n1: Double, n2: Double) {
            if (n2 != 0.0) {
                val divisao = n1 / n2
                println("$n1 / $n2 = ${"%.1f".format(divisao)}")
            } else {
                println("Não é possível fazer divisão por $n2. Tente novamente ;)")
            }
        }

        fun raiz(n1: Double, n2: Double) {
            val raizN1 = sqrt(n1)
            val raizN2 = sqrt(n2)
            println("√($n1) = ${"%.1f".format(raizN1)}")
            println("√($n2) = ${"%.1f".format(raizN2)}")
        }

        fun pot(n1: Double, n2: Double) {
            val pot = n1.pow(n2)
            println("$n1 ^ $n2 = $pot")
        }
    }
}