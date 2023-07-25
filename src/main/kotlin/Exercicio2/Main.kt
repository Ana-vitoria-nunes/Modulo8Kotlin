package Exercicio2

fun main() {
    val diaSemana=DiaSemana()
    println("Digite um número de 1 a 7:")
    val numero = readln().toIntOrNull()

    diaSemana.mostrarDiaSemana(numero)
}