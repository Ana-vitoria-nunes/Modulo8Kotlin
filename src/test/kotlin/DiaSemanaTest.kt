import Exercicio2.DiaSemana
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class DiaSemanaTest {

    @Test
    fun verificarDiaSemana(){
        val diaSemana= DiaSemana()

        val dia=diaSemana.mostrarDiaSemana(2)
        Assertions.assertEquals( "Segunda-feira", dia)
    }
    @Test
    fun verificarDiaSemanaInvalido(){
        val diaSemana= DiaSemana()

        val dia=diaSemana.mostrarDiaSemana(-1)
        Assertions.assertEquals( "Valor inválido", dia)
    }
}