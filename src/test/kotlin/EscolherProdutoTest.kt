import Exercicio1.EscolherProduto
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class EscolherProdutoTest {
    @Test
    fun verificarOPrecoMaisBarato(){
        val escolher=EscolherProduto()
        val preco1=1.0
        val preco2=4.0
        val preco3=5.0
        val produtobarato=escolher.encontrarProdutoMaisBarato(preco1,preco2,preco3)
        assertEquals("Você deve compra o primeiro produto",produtobarato)
    }

    @Test
    fun verificarPrecoNulo(){
        val escolher=EscolherProduto()
        val preco1: Double? =null
        val preco2=4.0
        val preco3=5.0
        val produtoNulo=escolher.encontrarProdutoMaisBarato(preco1,preco2,preco3)
        assertEquals("Não aceitamos preços nulos ",produtoNulo)
    }
    @Test
    fun verificarPrecoMenorQueZero(){
        val escolher=EscolherProduto()
        val preco1=-6.0
        val preco2=4.0
        val preco3=5.0
        val produtoNegativo=escolher.encontrarProdutoMaisBarato(preco1,preco2,preco3)
        assertEquals("Não aceitamos preço menor que 0",produtoNegativo)
    }
}