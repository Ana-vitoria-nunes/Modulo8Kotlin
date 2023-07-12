package exercicio5
class Passarinho(nome: String, raca: String, responsavel: String) : Animal(nome, raca, responsavel) {
    override fun movimentar() {
        println("$nome está voando.")
    }
    override fun comer() {
        println("$nome está comendo ração molhada.")
    }
    override fun dormir() {
        println("$nome está dormindo de olho aberto.")
    }
}