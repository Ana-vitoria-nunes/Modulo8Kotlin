package Exercicio1

class CDs(nome: String, preco: Double, codigo: String?, val numFaixas: Int) : Loja(nome, preco,codigo) {
    override fun mostrarDetalhe() {
        super.mostrarDetalhe()
        print("Número de Faixas: $numFaixas")
    }
}