package Exercicio1
import kotlin.arrayOf
fun main() {
    val produtos = arrayOf(
        Livros("Livro 1", 29.99,null,"Autor 1"),
        CDs("CD 1", 19.99, null,10),
        DVDs("DVD 1", 24.99,null, 150),
        Livros("Livro 2", 39.99,null, "Autor 2"),
        CDs("CD 2", 14.99,null, 10)
    )
    println("=====Produtos sem codigo de barras=====")
    for (p in produtos){
        p.mostrarDetalhe()
        println()
    }
    println("---------------------------------")
    val produtosNovos = arrayOf(
        Livros("Livro 1", 29.99,"00","Autor 1"),
        CDs("CD1", 19.99,"11", 12),
        DVDs("DVD 1", 24.99, "22",150),
        DVDs("DVD 2", 20.99,"33", 200),
        Livros("Livro 2", 39.99,"44", "Autor 2"),
        CDs("CD 2", 14.99,"55", 10)
    )
    println("=====Produtos com codigo de barras=====")
    for (p in produtosNovos){
        p.mostrarDetalhe()
        println()
    }
    val possuiCodigosRepetidos = verificarCodigosRepetidos(produtosNovos)
    if (possuiCodigosRepetidos) {
        println("Existem códigos de barras repetidos no vetor.")
    } else {
        println("Não existem códigos de barras repetidos no vetor.")
    }

    val produtoBusca =CDs("CD1", 19.99,"11", 12)
    val produtoBuscaD =CDs("lsl", 19.99,"58", 12)
    buscarProduto(produtoBusca,produtosNovos)
    buscarProduto(produtoBuscaD,produtosNovos)


}
fun verificarCodigosRepetidos(produtos: Array<Loja>): Boolean {
    for (i in 0 until produtos.size - 1) {
        val codigoBarras = produtos[i].codigo
        for (j in i + 1 until produtos.size) {
            if (codigoBarras == produtos[j].codigo) {
                return true
            }
        }
    }
    return false
}
fun buscarProduto(produto:Loja, produtos: Array<Loja>) {
    for ((index, p) in produtos.withIndex()) {
        if (produto == p) {
            println("Produto encontrado na posição $index")
            return
        }
    }
    println("Produto não encontrado.")
}

