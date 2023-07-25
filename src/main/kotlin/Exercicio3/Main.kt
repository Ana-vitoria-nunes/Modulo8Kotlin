package Exercicio3

fun main() {

    val mairNumero=MaiorNumero()
    print("Digite o 1º número: ")
    val numero1= readln().toDoubleOrNull()
    print("Digite o 2º número: ")
    val numero2= readln().toDoubleOrNull()
    print("Digite o 3º número: ")
    val numero3= readln().toDoubleOrNull()
    print("Digite o 4º número: ")
    val numero4= readln().toDoubleOrNull()
    print("Digite o 5º número: ")
    val numero5= readln().toDoubleOrNull()

    println(mairNumero.mostrarMaiorNumero(numero1,numero2,numero3,numero4,numero5))

}