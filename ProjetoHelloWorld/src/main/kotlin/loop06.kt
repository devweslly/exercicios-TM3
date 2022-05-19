
// Escrever um programa que receba vários números inteiros no teclado. E no
// final imprimir a média dos números múltiplos de 3. Para sair digitar
// 0(zero).(DO...WHILE)

fun mediaMult3(){
    // Inicializando a variavel soma e contador
    var soma = 0.0
    var cont = 0.0

    // Estrutura de Repetição
    do {
        println("Entre com um número inteiro:")
        val num = readln().toInt()

        if (num % 3 == 0){
            soma += num
            cont++
        }
    } while (num != 0)

    cont--
    val media = (soma/cont)

    // Saida de dados
    println("Média dos multiplos de 3: $media")
}