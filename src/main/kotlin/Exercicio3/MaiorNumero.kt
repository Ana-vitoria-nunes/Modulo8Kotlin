package Exercicio3

class MaiorNumero {

    fun mostrarMaiorNumero(num1:Double?,num2:Double?,num3:Double?,num4:Double?,num5:Double?):String{
        val numero1 = num1 ?: 0.0
        val numero2 = num2 ?: 0.0
        val numero3 = num3 ?: 0.0
        val numero4 = num4 ?: 0.0
        val numero5 = num5 ?: 0.0
        val mairNumero= maxOf(numero1,numero2,numero3,numero4,numero5)

        return "O maior numero é $mairNumero"

    }
}