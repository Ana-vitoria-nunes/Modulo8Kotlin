package Exercicio3

class Aluno {
    private val notas = mutableListOf<Double>()
    fun adicionarNota(nota: Double) {
        notas.add(nota)
    }

    fun calcularMedia(): Double {
        if (notas.size != 4) {
            throw IllegalArgumentException("É necessário informar as 4 notas para calcular a média semestral.")
        }

        return notas.sum() / notas.size
    }
    fun limparNotas() {
        notas.clear()
    }
    fun lançarNotas(){
        for (i in 1..4) {
            var nota: Double
            do {
                println("Informe a nota $i:")
                nota = readln().toDoubleOrNull()!!
            } while (nota !in 0.0..10.0)
            adicionarNota(nota)
        }
        val mediaSemestral =calcularMedia()
        println("Média = $mediaSemestral")
    }
}