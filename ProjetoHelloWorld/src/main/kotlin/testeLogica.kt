fun testeLogica() {
    // Estrutura de Repetição
    for (i in 1..100) {
        // Saida de dados
        if (i % 3 == 0 && i % 5 == 0) {
            println("$i é multiplo de 3 e 5: Fizzbuzz")
        } else if (i % 3 == 0) {
            println("$i é multiplo de 3: Fizz")
        } else if (i % 5 == 0) {
            println("$i é multiplo de 5: Buzz")
        }
    }
}