fun main () {
    var numFilhos = 0
    var pessoasSalario100 = 0
    var numPessoas = 1.0f
    var salario = 0.0f
    var totalFilhos = 0.0
    var mediaSalario = 0.0f;
    var maiorSalario = 0.0f
    var percentual100 = 0.0f
    var mediaFilhos = 0.0f
    var totalSalario = 0.0f
    var aux = 1.0f

    for (numeroPessoas in 1..5 ) {

        println("Pessoa $aux - Informe o salario: ")
        salario = readln().toFloat()
        println("Pessoa $aux - Informe o número de filhos: ")
        numFilhos = readln().toInt()
        totalFilhos += numFilhos
        totalSalario += salario
        if (salario <= 100) {
            pessoasSalario100++
        }
        if (salario > maiorSalario) {
            maiorSalario = salario
        }
        percentual100 = (pessoasSalario100/aux)*100
        mediaSalario = totalSalario/numPessoas
        mediaFilhos = (totalFilhos/numPessoas).toFloat()
        aux++
    }


    println("--- TABELA DE INFORMAÇÕES ---\n")
    println("A média de salário da população é: $mediaSalario",)
    println("A média de filhos da população é: $mediaFilhos")
    println("Maior salário: $maiorSalario")
    println("Número de pessoas que ganham até 100 reais: $pessoasSalario100")
    println("Percentual de pessoas com salário até R$100,00: $percentual100")

}