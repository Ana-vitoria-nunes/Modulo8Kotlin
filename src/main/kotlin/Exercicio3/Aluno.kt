package Exercicio3

class Aluno {
    private val notas = mutableListOf<Double>()
    fun adicionarNota(nota: Double) {
        notas.add(nota)
    }

    fun calcularMediaSemestral(): Double {
        if (notas.size != 4) {
            throw IllegalArgumentException("É necessário informar as 4 notas para calcular a média semestral.")
        }

        return notas.sum() / notas.size
    }
    fun limparNotas() {
        notas.clear()
    }
}