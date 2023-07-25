package Exercicio1

class EscolherProduto {

    fun encontrarProdutoMaisBarato(preco1: Double?, preco2: Double?, preco3: Double?):String {

        if (preco1 != null && preco2 != null && preco3 != null) {
            if (preco1>0 && preco2>0 && preco3>0) {

                val menorPreco = minOf(preco1, preco2, preco3)

                when {
                    preco1 == menorPreco -> {
                        return "Você deve compra o primeiro produto"
                    }

                    preco2 == menorPreco -> {
                        return "Você deve compra o segundo produto"
                    }

                    else -> {
                        return "Você deve compra o terceiro produto"
                    }
                }
            }
        } else {
          return "Não aceitamos preços nulos "
        }
        return "Não aceitamos preço menor que 0"
    }
}