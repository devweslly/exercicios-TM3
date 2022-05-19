
// Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
// 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
// idade for =-99.

fun SolicIdade() {
    // Contadores das idades
    var cont21 = 0
    var cont50 = 0

    // Incializando a variavel idade
    var idade = 0

    // Estrutura de Repetição
    while (idade != -99){
        println("Entre com a idade:")
        idade = readln().toInt()

        if (idade in 0..21){ // idade >= 0 && idade <= 21
            cont21++
            cont21 = cont21 + 1
        } else if (idade >= 50){
            cont50++
        }
    }

    // Saida de dados
    println("Total de pessoas com menos de 21 anos: $cont21")
    println("Total de pessoas com mais de 50 anos: $cont50")
}