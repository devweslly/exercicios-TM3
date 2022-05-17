fun maiorDetres() {
    // Entrada de dados
    println("Entre com o primeiro numero:")
    val num1 = readLine()!!.toInt()
    println("Entre com o segundo numero:")
    val num2 = readLine()!!.toInt()
    println("Entre com o terceiro numero:")
    val num3 = readLine()!!.toInt()

    // Saida de dados - Estrutura de seleção
    if (num1 > num2 && num1 > num3) {
        println("O número $num1 é o maior")
    } else if (num2 > num3) {
        println("O número $num2 é o maior")
    } else {
        println("O número $num3 é o maior")
    }
}