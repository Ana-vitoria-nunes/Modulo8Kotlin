package exercicio2

import java.lang.UnsupportedOperationException

fun main() {
    val mercado = ListaMercado()
    var escolha = 0

    while (escolha != 5) {
        try {

            println("Menu: \n1 - Verdura \n2 - Legumes \n3 - Grãos \n4 - Outros \n5 - Sair e mostrar lista do mercado")
            escolha = readln().toInt()

            when (escolha) {
                1 -> mercado.comprarVerdura()
                2 -> mercado.comprarLegumes()
                3 -> mercado.comprarGraos()
                4 -> mercado.comprarOutros()
                5 -> mercado.listarEFinalizar()
                else -> println("Opção inválida")
            }
            println()
        } catch (exception: NumberFormatException) {
            println("Entrada inválida. ${exception.message}")
            println()
        } catch (exception: IllegalArgumentException) {
            println(exception.message)
            println()
        }
        catch (exception: UnsupportedOperationException) {
            println(exception.message)
            println()
        }
    }
}

