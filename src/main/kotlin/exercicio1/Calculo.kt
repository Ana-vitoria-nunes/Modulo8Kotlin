package exercicio1
class Calculo {

    fun divisao(divisor: Int, dividendo: Int) {
        try {
            val resultado:Double= (dividendo/divisor).toDouble()
            println("Resultado:$resultado")
        } catch (e: ArithmeticException) {
            e.printStackTrace()
            println("Causa: ${e.cause}")
            println(message = "Mesagem: Operação não pode ser realizada. Divisão por zero.")

        }
    }
}