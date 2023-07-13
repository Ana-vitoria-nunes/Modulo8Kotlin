package Exercicio1
class Livros(nome: String, preco: Double, codigo: String?, val autor: String) : Loja(nome, preco, codigo)  {
    override fun mostrarDetalhe() {
        super.mostrarDetalhe()
        println("Autor: $autor")
    }
}