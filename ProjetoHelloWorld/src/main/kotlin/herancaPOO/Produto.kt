package herancaPOO

class Produto {
    class Produto {

        val listaProduto = mutableListOf<String>()

        // Cadastrar dados da listaProduto
        fun cadastroProd() {
            while (true) {
                println("Entre com o valor do produto:")
                val valor = readln()

                if (valor != "") {
                    listaProduto.add(valor)
                    println("Item $valor cadastrado com sucesso =)")
                } else {
                    break // parar o while quando valor for vazio
                }
            }
        }

        // Remover dados da listaProduto
        fun removerProd() {
            while (true) {
                println("Entre com o valor do produto para ser removido:")
                val valor = readln()

                if (listaProduto.isEmpty()) {
                    println("Não existe item na lista")
                } else {
                    if (listaProduto.contains(valor)) {
                        listaProduto.remove(valor)
                        println("Item $valor removido com sucesso =)")
                    } else if (valor == "") {
                        break // parar o while quando valor for vazio
                    } else {
                        println("Item $valor não consta na lista!")
                    }
                }
            }
        }

        // Editar dados da listaProduto
        fun editarProd() {
            while (true) {
                println("Entre com o valor do produto para ser editado:")
                val valor = readln()

                if (listaProduto.isEmpty()) {
                    println("Não existe item na lista")
                } else {
                    if (listaProduto.contains(valor)) {
                        val index = listaProduto.indexOf(valor)
                        println("Adicionar novo item:")
                        val novoItem = readln()
                        listaProduto[index] = novoItem
                        println("Item $valor foi atualizado para item $novoItem.")
                    } else if (valor == "") {
                        break // parar o while quando valor for vazio
                    } else {
                        println("O item $valor não existe na lista.")
                    }
                }
            }
        }

        // Mostrar dados da listaProduto
        fun mostraProd() {
            listaProduto.forEach {
                println(it)
            }
        }
    }
}