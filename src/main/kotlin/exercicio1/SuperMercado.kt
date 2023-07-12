package exercicio1

import java.time.LocalDate

class SuperMercado {
    companion object{
    val produto1 = Produto("Arroz", "123", LocalDate.of(2023, 11, 14))
    val produto2 = Produto("Feijão", "987", LocalDate.of(2024, 3, 11))
    val produto3 = Produto("Macarrão", "654", LocalDate.of(2024, 5, 9))
    val listaProduto = ArrayList<Produto>()
    val produtosComprados = mutableMapOf<String, Int>()

    fun comprar() {
        listaProduto.add(produto1)
        listaProduto.add(produto2)
        listaProduto.add(produto3)
        println("=====Bem vindo(a) ao nosso mercado=====")
        println("Produtos disponiveis:")
        for (valor in listaProduto) {
            println(valor.toString())
            println("-----------------------")
        }
        while (true) {
            println("Digite o código de barras do produto que deseja comprar (ou 'sair' para finalizar):")
            val codigos = readLine() ?: ""
            if (codigos == "sair") {
                break
            }

            val produtoEncontrado = listaProduto.find { it.codigo == codigos }
            if (produtoEncontrado != null) {
                val quantidade = produtosComprados.getOrDefault(codigos, 0)
                produtosComprados[codigos] = quantidade + 1
                println("Produto '${produtoEncontrado.nome}' adicionado ao carrinho.")
            } else {
                println("Produto não encontrado. Tente novamente.")
            }
        }
    }
        fun listaCompras() {
            println("Produtos comprados:")
            for ((codigos, quantidade) in produtosComprados) {
                val produto = listaProduto.find { it.codigo == codigos }
                if (produto != null) {
                    println("Nome: ${produto.nome}")
                    println("Código de Barras: ${produto.codigo}")
                    println("Data de Validade: ${produto.dataValidade}")
                    println("Quantidade comprada: $quantidade")
                    println()
                }
            }
        }
    }
}

