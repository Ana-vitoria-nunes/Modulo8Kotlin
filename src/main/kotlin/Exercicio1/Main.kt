package Exercicio1

fun main() {
    val escolherProduto=EscolherProduto()

        println("Digite o 1° preço do primeiro produto.")
        val preco = readln().toDoubleOrNull()
        println("Digite o 2° preço segundo produto.")
        val preco1 = readln().toDoubleOrNull()
        println("Digite o 3° preço terceiro produto.")
        val preco2 = readln().toDoubleOrNull()

       println(escolherProduto.encontrarProdutoMaisBarato(preco,preco1,preco2))
}