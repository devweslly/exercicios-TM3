package herancaPOO

fun main() {

    var cachorro = Mel("Mel", 11, "Dog")

    cachorro.correr()
    cachorro.som("Au Au Au")
    println("_____________________")

    var cavalo = Spirit(nome = "Spirit", idade = 20, especie = "Cavalo")

    cavalo.correr()
    cavalo.som("hinn in in")

    cavalo.som()

}