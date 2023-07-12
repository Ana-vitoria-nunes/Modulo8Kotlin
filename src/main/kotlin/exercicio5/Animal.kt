package exercicio5
open class Animal(val nome: String, val raca: String, val responsavel: String) {
    open fun movimentar() {}
    open fun comer() {}
    open fun dormir() {}

}