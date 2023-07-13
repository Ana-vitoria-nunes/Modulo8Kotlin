package Exercicio2
import kotlin.math.PI
    class Circulo(val raio: Float) : Forma() {
        override fun calcularArea(): String {
            return "Área do Circulo - ${PI.toFloat() * raio * raio}"
        }
        override fun calcularPerimetro(): String {
            return "Perímetro do Circulo - ${2 * PI.toFloat() * raio}"
        }
}