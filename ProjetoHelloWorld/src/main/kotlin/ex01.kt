import kotlin.reflect.typeOf

// Criar uma inteligência artificial, que fará algumas perguntas
// ao usuário e ele fará os inputs dessa informação.
// Ao final, o robô precisa fazer o output de todas essas informações

fun main() {
    //Entrada de variaveis
    // Nome
    // Idade
    // Altura
    // Pesa

    // Entrada de dados
    println("Qual o seu nome") // escreva no portugol
    val nome:String = readLine()!!.toString() // Leia no portugol
    println("Qual a sua idade")
    val altura = readLine()!!.toInt()
    
    // Saida de dados
    //println("Nome: $nome") // ("Nome: " + nome)
    println(altura.javaClass.name)
}