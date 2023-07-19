package exercicio3
import java.math.BigDecimal
class Moedas {
    fun moedaValida(moeda:Int){
        when(moeda){
            1,2,3,4->Unit
            else-> throw IllegalArgumentException("Tipo de moeda inválido")
        }
    }
    fun validarValor(valorString: String):BigDecimal{
        val valor=BigDecimal(valorString)
        if(valorString.isEmpty()){
            throw NullPointerException("Para moeda, o valor monetário deve ser um número decimal")
        }
        if (valor<=BigDecimal.ZERO){
            throw NumberFormatException("Valor inválido, por favor, tente novamente")
        }
        return valor
    }
    fun cotacao(moeda: Int):BigDecimal{
        return when(moeda){
            1->BigDecimal("5.20")
            2-> BigDecimal("4.10")
            3-> BigDecimal("6.00")
            4-> BigDecimal("7.50")
            else->throw IllegalArgumentException("Tipo de moeda inválido")
        }
    }
    fun converter(moeda: Int,valor:BigDecimal):BigDecimal{
        val cotacoes=cotacao(moeda)
        return valor.multiply((cotacoes))
    }
}
