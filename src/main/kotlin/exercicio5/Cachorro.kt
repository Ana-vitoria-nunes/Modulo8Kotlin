package exercicio5

class Cachorro(nome: String, raca: String, responsavel: String) : Animal(nome, raca, responsavel) {

    override fun movimentar() {
        println("$nome está andando em 4 patas.")
    }
    override fun comer() {
        println("$nome está comendo bife.")
    }
    override fun dormir() {
        println("$nome está dormindo na cama do(a) $responsavel.")
    }
}