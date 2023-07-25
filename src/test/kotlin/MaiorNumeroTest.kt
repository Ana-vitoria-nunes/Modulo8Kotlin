import Exercicio3.MaiorNumero
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaiorNumeroTest {
    val maiorNumero= MaiorNumero()
    @Test
    fun testarMaiorNumero() {
        val resultado = maiorNumero.mostrarMaiorNumero(10.5, 5.8, 7.2, 15.3, 3.1)
        assertEquals("O maior numero é 15.3", resultado)
    }
    @Test
    fun testarMaiorNumeroComNull() {
        val resultado = maiorNumero.mostrarMaiorNumero(10.5, 5.8, 7.2, null, 3.1)
        assertEquals("O maior numero é 10.5", resultado)
    }
    @Test
    fun testarMaiorNumeroSendoNull() {
        val resultado = maiorNumero.mostrarMaiorNumero(null, -9.0, -8.5, -1.0, -4.9)
        assertEquals("O maior numero é 0.0", resultado)
    }
}