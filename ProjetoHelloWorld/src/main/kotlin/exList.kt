// Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
// trabalhar com Collection do tipo List do Kotlin para manipular os dados
// desse estoque, o programa deverá atender as seguintes funcionalidades:

// Armazenar dados da List;
// Remover dados da list;
// Atualizar dados da list;
// Apresentar todos os dados da list.

fun main() {

    val estoque = mutableListOf<String>()

    println("*************MENU ESTOQUE*************")
    println("1 - ADICIONAR ITEM ao Estoque")
    println("2 - DELETAR ITEM ao Estoque")
    println("3 - EDITAR ITEM ao Estoque")
    println("4 - SAIR do Menu")

    while (true) {
        println("Entre com uma OPÇÃO de MENU:")
        val opcao = readln().toInt()

        when (opcao) {
            1 -> addItem(estoque)
            2 -> deletaItem(estoque)
            3 -> editaItem(estoque)
            4 -> break
            5 -> println("Opção inválida!")
        }
    }

    // Apresentar todos os dados da list
    println("O tamanho do estoque é: ${estoque.size}") // informa qtda de itens da list estoque
    println("Items do estoque: $estoque") // traz todos os items da list estoque
}

fun addItem(estoque: MutableList<String>): MutableList<String> {
    // Armazenar dados da List
    while (true) {
        println("Entra com um valor para o estoque:")
        val valor = readln()

        if (valor != "") {
            estoque.add(valor) // Adiciona o valor a list estoque
        } else {
            break // para o while quando valor for ""
        }
    }

    return estoque
}

fun deletaItem(estoque: MutableList<String>): MutableList<String> {
    // Verificando se a list estoque ta vazia
    if (estoque.isEmpty()) {
        println("O Estoque não contem ITEM para ser deletado")
    } else {
        // Remover item da list estoque
        while (true) {
            println("Digite um item para deletar do estoque:")
            val valor = readln()

            //contains - Verifica se um valor existe na list estoque
            if (estoque.contains(valor)) {
                estoque.remove(valor)
            } else if (valor == "") {
                break // parar o while
            } else {
                println("O item $valor não existe no estoque.")
            }
        }
    }

    return estoque
}

fun editaItem(estoque: MutableList<String>): MutableList<String> {

    if (estoque.isEmpty()) {
        println("O Estoque não contem ITEM para ser editado")
    } else {
        // Atualizar dados da list
        while (true) {
            println("Informe um item para ser editado:")
            val edit = readln()

            if (estoque.contains(edit)) {
                val index = estoque.indexOf(edit)
                println("Digite um novo item:")
                val valor = readln()
                estoque[index] = valor
                println("O item $edit foi atualizado para $valor")
            } else if (edit == "") {
                break
            } else {
                println("O item $edit não existe em estoque.")
            }
        }
    }

    return estoque
}

fun sair(){

}