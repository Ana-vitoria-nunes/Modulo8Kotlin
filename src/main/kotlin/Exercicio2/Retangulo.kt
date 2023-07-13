package Exercicio2

import kotlin.math.PI

class Retangulo (val lado:Float,val altura:Float): Forma() {
    override fun calcularArea(): String {
        return "Área do Retangulo - ${lado*altura}"
    }
    override fun calcularPerimetro(): String {
        return "Perimetro do Retangulo - ${2*(lado+altura)}"
    }

}