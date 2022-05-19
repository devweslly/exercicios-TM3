// Ler 10 números e imprimir quantos são pares e quantos são ímpares.

fun parImparLoop() {
    // Contadores de numeros pares e impares
    var contPar = 0
    var contImpar = 0

    //Estrutura de Repetição
    for (i in 1..10) {
        // Entrada de dados
        println("Entre com um número inteiro:")
        val num = readln().toInt()

        // Saida de dados
        if (num % 2 == 0) {
            println("$num é par")
            contPar++
        } else {
            println("$num é impar")
            contImpar++
        }
    }

    // Saida - Resultado da quantidade de impares e pares
    println("Quantidade de entradas pares: $contPar")
    println("Quantidade de entradas impares: $contImpar")
}