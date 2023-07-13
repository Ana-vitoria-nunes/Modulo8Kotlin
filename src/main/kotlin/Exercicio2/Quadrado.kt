package Exercicio2

class Quadrado (val lado:Float,val altura:Float): Forma() {
    override fun calcularArea(): String {
        return "Área do quadrado - ${lado*altura}"
    }
    override fun calcularPerimetro(): String {
        return "Perimetro do quadrado - ${2*(lado+altura)}"
    }
}