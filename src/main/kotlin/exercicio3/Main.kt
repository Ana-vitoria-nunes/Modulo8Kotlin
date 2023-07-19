package exercicio3
import java.math.RoundingMode
import java.text.DecimalFormat
fun main() {
    val moedas = Moedas()
    val decimalFormat = DecimalFormat("#,##0.00")
    decimalFormat.roundingMode = RoundingMode.HALF_UP

    println("Boas vindas ao conversor de moedas")
    var cont = false
    while (!cont) {
        println()
        println("Qual moeda deseja converter para real?\n1-Dólar americano\n2-Dólar canadense\n3-Euro\n4-Libra Esterlina\n5-Sair")
        val moeda = readln().toInt()
        try {
            when (moeda) {
                1 -> {
                    print("Digite o valor a ser convertido para real: ")
                    val valorString = readln()
                    val valor = moedas.validarValor(valorString)
                    val valorConvertido = moedas.converter(moeda, valor)
                    println(
                        "O Dólar americano na cotação de hoje está em ${moedas.cotacao(moeda)} o valor que pediu para converter de ${
                            decimalFormat.format(valor)
                        } em reais é R$${decimalFormat.format(valorConvertido)}"
                    )
                }
                2 -> {
                    print("Digite o valor a ser convertido para real: ")
                    val valorString = readln()
                    val valor = moedas.validarValor(valorString)
                    val valorConvertido = moedas.converter(moeda, valor)
                    println(
                        "O Dólar canadense na cotação de hoje está em ${moedas.cotacao(moeda)} o valor que pediu para converter de ${
                            decimalFormat.format(valor)
                        } em reais é R$${decimalFormat.format(valorConvertido)}"
                    )
                }
                3 -> {
                    print("Digite o valor a ser convertido para real: ")
                    val valorString = readln()
                    val valor = moedas.validarValor(valorString)
                    val valorConvertido = moedas.converter(moeda, valor)
                    println(
                        "O Euro na cotação de hoje está em ${moedas.cotacao(moeda)} o valor que pediu para converter de ${
                            decimalFormat.format(valor)
                        } em reais é R$${decimalFormat.format(valorConvertido)}"
                    )
                }
                4 -> {
                    print("Digite o valor a ser convertido para real: ")
                    val valorString = readln()
                    val valor = moedas.validarValor(valorString)
                    val valorConvertido = moedas.converter(moeda, valor)
                    println(
                        "A Libra na cotação de hoje está em ${moedas.cotacao(moeda)} o valor que pediu para converter de ${
                            decimalFormat.format(valor)
                        } em reais é R$${decimalFormat.format(valorConvertido)}"
                    )
                }
                5 -> {
                    println("Encerrando programa de conversão...")
                    cont=true
                }
                else -> throw IllegalArgumentException("Tipo de moeda inválido")
            }
        } catch (e: NumberFormatException) {
            println(e.message)
        } catch (e: IllegalArgumentException) {
            println(e.message)
        } catch (e: NullPointerException) {
            println(e.message)
        }
    }
}
