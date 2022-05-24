package POO

class Cliente2(private var nome: String, private var idade: Int, private var saldo: Double) {

    // Atributos
    private var endereco = ""
    private var telefone = 0
    private var listaDeCompra = mutableListOf<String>()

    // Construtor secundário - os atributos fora doconstrutor primario precisam ser mutávei (var)
    constructor(
        nome: String, idade: Int, saldo: Double,
        endereco: String, telefone: Int
    ) : this(nome, idade, saldo) {
        this.endereco = endereco
        this.telefone = telefone
    }

    // Construtor terciário - os atributos fora doconstrutor primario precisam ser mutávei (var)
    constructor(
        nome: String, idade: Int, saldo: Double,
        endereco: String, telefone: Int, listaDeCompra: MutableList<String>
    ) : this(nome, idade, saldo, endereco, telefone) {
        this.listaDeCompra = listaDeCompra
    }

    //Exceção - Medida que o programa utiliza caso alguma regra seja descumprida
    //que leva o programa a ser finalizado
    init {
        if (nome == ""){
            throw Exception("A classe foi instanciada de maneira incorreta.")
        }
    }

    // Metodos --> Comportamentos
    fun mostraInfo() {
        println("Informações Cliente:")
        println("Nome: $nome. Idade: $idade. Saldo: $saldo")
    }

    fun addItemCompra(valor: String) {
        if (valor != "") {
            listaDeCompra.add(valor)
            println("O item $valor foi adicionado a sua lista de compra.")
        } else {
            println("É preciso fornecer um nome para o item.")
        }
    }

    fun removeItemCompra(valor: String) {
        if (listaDeCompra.contains(valor)) {
            listaDeCompra.remove(valor)
            println("O item $valor foi removido da sua lista de compra.")
        } else {
            println("O item $valor não existe em sua lista de compra.")
        }
    }

    // Mostrar itens da lista (nomeLista.forEach)
    fun mostraListaCompra() {
        listaDeCompra.forEach {
            println("Mostrar intens da litas:")
            println(it)
        }
    }
}