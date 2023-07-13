package Exercicio2

fun main() {
    val formas= arrayOf(
        Retangulo(10f,5f),
        Quadrado(6f,7f),
        Circulo(9f)
    )

    for (forma in formas){
        println(forma.calcularArea())
        println(forma.calcularPerimetro())
        println("------------------------")
    }
}