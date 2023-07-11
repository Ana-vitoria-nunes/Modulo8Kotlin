package Exercicio3
fun main() {
    val aluno = Aluno()
    println("=====Bem vindo(a)=====")

    var entrada = false
    while (!entrada) {
        for (i in 1..4) {
            var nota: Double
            do {
                println("Informe a nota $i:")
                nota = readln().toDoubleOrNull()!!
            } while (nota !in 0.0..10.0)
            aluno.adicionarNota(nota)
        }
        val mediaSemestral = aluno.calcularMediaSemestral()
        println("Média = $mediaSemestral")

        println("Deseja fazer um novo cálculo (1-sim 2-não):")
        val res = readLine()?.toIntOrNull()

        when (res) {
            1 -> {
                aluno.limparNotas()
                continue
            }

            2 -> {
                println("Encerrando o programa...")
                entrada = false
            }

            else -> {
                println("Opção inválida. Por favor, informe 1 para novo cálculo ou 2 para encerrar.")
            }

        }

    }
}


