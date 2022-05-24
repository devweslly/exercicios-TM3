package POO

class Cliente2(var nome: String, var idade: Int, var saldo: Double) {

    // Metodos --> funções
    fun mostraInfo(){
        println("Nome: $nome. Idade: $idade. Saldo: $saldo")
    }

}