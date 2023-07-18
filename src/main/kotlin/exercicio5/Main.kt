package exercicio5

import java.time.LocalDate
import java.time.format.DateTimeFormatter

fun main() {
    val turma=Turma()
    do {
        println("Selecione uma opção:")
        println("1. Cadastrar aluno")
        println("2. Listar alunos")
        println("3. Listar alunos com sobrenome")
        println("4. Listar o aluno mais velho")
        println("5. Listra media de idade dos alunos")
        println("6. Atualizar dados de um aluno")
        println("7. Remover um aluno")
        println("8. Sair")
        val opcao = readlnOrNull()?.toIntOrNull()

        when (opcao) {
            1 -> {
                println("==== Cadastro de Aluno ====")
                print("Matrícula: ")
                val matricula = readlnOrNull()?.toIntOrNull()

                if (matricula != null) {
                    print("Nome: ")
                    val nome = readlnOrNull()
                    print("Sobrenome: ")
                    val sobrenome = readlnOrNull()
                    print("Data de Nascimento (dd/MM/yyyy): ")
                    val dataNascimentoStr = readlnOrNull()
                    val formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")
                    val dataNascimento = LocalDate.parse(dataNascimentoStr, formatter)
                    print("Sexo: ")
                    val sexo = readlnOrNull()
                    if (!nome.isNullOrBlank() && !sexo.isNullOrBlank() && !sobrenome.isNullOrBlank()) {
                        val aluno = Aluno(matricula, nome, sobrenome, dataNascimento, sexo)
                        turma.cadastraAluno(aluno)
                    }
                    else{
                        println("Dados inválidos. Cadastro não realizado.")
                    }
                }
                else {
                    println("Matrícula inválida.")
                }
            }
            2 -> {
                println("==== Listagem de Alunos ====")
                turma.listarAlunos()
            }
            3 -> {
                println("Qual o sobrenome do aluno:")
                val sobrenome= readlnOrNull()
                if (!sobrenome.isNullOrBlank()) {
                    turma.listarAlunosSobrenome(sobrenome)
                }
                else{
                    println("Invalido digite algo")
                }
            }
            4 -> {
               turma.listarAlunoMaisIdoso()
            }
            5 -> {
                turma.calcularMediaIdadeAlunos()

            }
            6 -> {
                println("==== Atualização de Dados de Aluno ====")
                print("Matrícula do aluno a ser atualizado: ")
                val matricula = readlnOrNull()?.toIntOrNull()

                if (matricula != null) {
                    print("Novo nome: ")
                    val novoNome = readlnOrNull()

                    print("Novo sobrenome: ")
                    val  novoSobrenome= readlnOrNull()

                    print("Novo sexo: ")
                    val novoSexo = readlnOrNull()
                    if (!novoNome.isNullOrBlank() && !novoSexo.isNullOrBlank() && novoSobrenome.isNullOrBlank()) {
                        if (novoSobrenome != null) {
                            turma.atualizarDadosAluno(matricula, novoNome, novoSobrenome, novoSexo)
                        }
                        else{
                            println("Dados inválidos. Cadastro não realizado.")
                        }
                    }
                } else {
                    println("Matrícula inválida.")
                }

            }
            7 -> {
                println("==== Remoção de Aluno ====")
                print("Matrícula do aluno a ser removido: ")
                val matricula = readlnOrNull()?.toIntOrNull()
                if (matricula != null) {
                    turma.removerAluno(matricula)
                } else {
                    println("Matrícula inválida.")
                }
            }
            8 -> {
                println("Saindo do programa...")
                break
            }
            else -> {
                println("Opção inválida. Tente novamente.")
            }
        }
    } while (true)
}