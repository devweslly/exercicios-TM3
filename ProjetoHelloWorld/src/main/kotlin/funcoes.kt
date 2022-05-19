fun calc(){
    println("Digite o primeiro numero inteiro:")
    val num1 = readln().toInt()

    println("Digite o segundo numero inteiro:")
    val num2 = readln().toInt()

    println("A soma entre $num1 e $num2 é igual ${soma(num1, num2)}")
    println("A soma entre $num1 e $num2 é igual ${sub(num1, num2)}")
    println("A soma entre $num1 e $num2 é igual ${mult(num1, num2)}")
    println("A soma entre $num1 e $num2 é igual ${divisao(num1.toDouble(), num2.toDouble())}")
}

fun soma(x1: Int, x2:Int): Int{
    val resultSoma = x1 + x2
    return resultSoma
}

fun sub(x1: Int, x2:Int): Int{
    val resultSub = x1 - x2
    return resultSub
}

fun mult(x1: Int, x2:Int): Int{
    val resultMult = x1 * x2
    return resultMult
}

fun divisao(x1: Double, x2:Double): Double{
    val resultDiv = x1 / x2
    return resultDiv
}