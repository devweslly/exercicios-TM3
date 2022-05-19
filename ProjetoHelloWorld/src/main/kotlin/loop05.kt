
// Crie um programa que leia um número do teclado até que encontre um
// número igual a zero. No final, mostre a soma dos números
// digitados.

fun somaNumero() {
    // Inicializando a variavel soma
    var soma = 0.0

    // Estrutura de Repetição
    do {
        println("Entre com um número inteiro:")
        val num = readln().toDouble()

        soma += num
    } while (num != 0.0)

    // Saida de dados
    println("Soma: $soma")
}