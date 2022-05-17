fun ordemCresc() {
    // Entrada de dados
    println("Entre com o primeiro numero inteiro:")
    var num1 = readLine()!!.toInt()
    println("Entre com o segundo numero inteiro:")
    var num2 = readLine()!!.toInt()
    println("Entre com o terceiro numero inteiro:")
    var num3 = readLine()!!.toInt()

    // Saida de dados - Estrutura de Seleção
    if (num1 > num2) {
        val aux = num1
        num1 = num2
        num2 = aux
    }
    if (num1 > num3) {
        val aux = num1
        num1 = num3
        num3 = aux
    }
    if (num2 > num3) {
        val aux = num2
        num2 = num3
        num3 = aux
    }

    println("Os números na ordem crescente são:")
    println("$num1, $num2 e $num3")
}