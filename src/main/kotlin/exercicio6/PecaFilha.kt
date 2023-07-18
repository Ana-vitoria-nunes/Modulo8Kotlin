package exercicio6

class PecaFilha(marca: String, modelo: String) : Peca(marca, modelo) {
    override fun retirada() {
        println("Peça retirada.")
    }
}