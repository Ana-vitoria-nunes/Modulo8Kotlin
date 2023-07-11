package Exercicio1

class Caixa() {
    companion object {
        val produto = mutableMapOf<Int, Produto>()
        fun adicionarproduto() {
            produto.put(11, Produto("lalal", 4.50, 10))
            produto.put(12, Produto("bababa", 6.50, 10))
            produto.put(13, Produto("acacca", 5.0, 10))

        }

        fun cadastrarProduto() {
            println("Quantos produtos deseja adicionar no estoque:")
            val add = readln().toInt()
            for (i in 1..add) {
                println("Produto $i")
                println("Qual o nome do produto:")
                val nom = readln()
                println("Qual o preço do produto:")
                val pre = readln().toDouble()
                println("Qual a gantidade do produto:")
                val quat = readln().toInt()
                println("Qual o codigo do produto:")
                val cod = readln().toInt()
                produto.put(cod, Produto(nom, pre, quat))
                println("Produto cadastrado com sucesso!")

            }
        }

        fun mostraProduto() {
            println("=====Produtos=====")
            for (valor in produto) {
                println("-Nome:${valor.value.nomes}|Preço:${valor.value.valores}|Quantidade:${valor.value.quantidade}|Codigo:${valor.key}")
            }
        }

        fun valorTotal() {
            var total = 0.0
            for (produto in produto.values) {
                total += produto.valores * produto.quantidade
            }
            println("Valor total: R$ $total")
        }

        fun comprar() {
            println("Quantos produtos deseja comprar:")
            val quant = readLine()?.toIntOrNull()
            if (quant != null && quant > 0) {
                var to = 0.0
                for (i in 1..quant) {
                    println("Digite o código do produto: ")
                    val codigo = readLine()?.toIntOrNull()
                    if (codigo != null && produto.containsKey(codigo)) {
                        val produto = produto[codigo]
                        if (produto != null) {
                            println("Quantos produtos você deseja:")
                            val quantCompra = readLine()?.toIntOrNull()
                            if (quantCompra != null && quantCompra > 0) {
                                if (produto.quantidade >= quantCompra) {
                                    produto.quantidade -= quantCompra
                                    println("Compra realizada com sucesso!")
                                    var total = produto.valores * quantCompra
                                    println("Total desse produto:$total")
                                    to += total
                                } else {
                                    println("Quantidade indisponível")
                                }
                            } else {
                                println("Quantidade inválida")
                            }
                        }
                    } else {
                        println("Código de produto inválido")
                    }
                }
                println()
                println("Total da compra ao todo:$to")
            } else {
                println("Quantidade inválida")
            }
        }
    }
}
