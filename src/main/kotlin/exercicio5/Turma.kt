package exercicio5
import java.time.LocalDate
import java.time.Period

class Turma {
    val alunos = mutableMapOf<Int, Aluno>()
    fun cadastraAluno(aluno: Aluno) {
        if (!existeMatricula(aluno.matricula)) {
            alunos[aluno.matricula] = aluno
            println("Aluno cadastrado com sucesso!")
        } else {
            println("Matrícula já existente. O aluno não foi cadastrado.")
        }
    }

    fun existeMatricula(matricula: Int): Boolean {
        return alunos.containsKey(matricula)
    }

    fun listarAlunos() {
        if (alunos.isNotEmpty()) {
            for ((matricula, aluno) in alunos) {
                println("Matrícula: $matricula - Aluno: ${aluno.nome},${aluno.sobrenome},${aluno.dataNacs},${aluno.sexo}")
            }
        } else {
            println("Não há alunos cadastrados.")
        }
    }

    fun listarAlunosSobrenome(sobrenome: String) {
        val alunosPorSobrenome = alunos.values.filter { aluno ->
            aluno.sobrenome.equals(sobrenome, ignoreCase = true)
        }
        if (alunosPorSobrenome.isNotEmpty()) {
            for (aluno in alunosPorSobrenome) {
                println("[ ${aluno.nome} ${aluno.sobrenome},${aluno.dataNacs},${aluno.matricula},${aluno.sexo}")
            }
        } else {
            println("Não há alunos cadastrados com o sobrenome informado.")
        }
    }

    fun listarAlunoMaisIdoso() {
        val alunoMaisIdoso = alunos.values.minByOrNull { aluno -> aluno.dataNacs }
        if (alunoMaisIdoso != null) {
            println("Aluno mais idoso:")
            println(alunoMaisIdoso.nome)
        } else {
            println("Não há alunos cadastrados.")
        }
    }

    fun calcularMediaIdadeAlunos() {
        if (alunos.isNotEmpty()) {
            val dataAtual = LocalDate.now()
            val somaIdades = alunos.values.sumBy { aluno ->
                Period.between(aluno.dataNacs, dataAtual).years
            }
            val mediaIdade = somaIdades.toDouble() / alunos.size
            println("Média de idade dos alunos: $mediaIdade")
        } else {
            println("Não há alunos cadastrados.")
        }
    }

    fun atualizarDadosAluno(matricula: Int, novoNome: String, novoSobrenome: String, novoSexo: String) {
        val aluno = alunos[matricula]
        if (aluno != null) {
            aluno.nome = novoNome
            aluno.sobrenome = novoSobrenome
            aluno.sexo = novoSexo
            println("Dados do aluno atualizados com sucesso!")
        } else {
            println("Aluno não encontrado. Não foi possível atualizar os dados.")
        }
    }

    fun removerAluno(matricula: Int) {
        val aluno = alunos.remove(matricula)
        if (aluno != null) {
            println("Aluno removido com sucesso!")
        } else {
            println("Aluno não encontrado. Não foi possível remover.")
        }
    }

}