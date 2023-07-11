package Exercicio2

import java.time.LocalDate

fun main() {
    val pessoa1 = Pessoa("Albert Einstein", LocalDate.of(1879, 3, 14))
    val pessoa2 = Pessoa("Isaac Newton", LocalDate.of(1643, 1, 4))

    val dataAtual = LocalDate.of(2023, 7, 11)

    val idade1 = pessoa1.informarIdade(dataAtual)
    val idade2 = pessoa2.informarIdade(dataAtual)

    var entrada = false
    while (!entrada) {
        println("====================================== Menu ======================================")
        println("Qual opção você deseja: ")
        println("1-Idade do Albert Einstein  2-Idade do Isaac Newton  3-Sua idade  4-Sair ")
        val option = readlnOrNull()?.toIntOrNull()

        when (option) {
            1 -> {
                println("${pessoa1.informarNome()} teria $idade1 anos se estivesse vivo(a).")
            }

            2 -> {
                println("${pessoa2.informarNome()} teria $idade2 anos se estivesse vivo(a).")
            }

            3 -> {
                println("Qual seu nome?")
                val nome = readln()
                println("Qual o dia do seu aniversario?")
                val dia = readln().toInt()
                println("Qual o mês do seu aniversario?")
                val mes = readln().toInt()
                println("Qual o ano do seu aniversario?")
                val ano = readln().toInt()
                val pessoa3 = Pessoa(nome, LocalDate.of(ano, mes, dia))
                val idade3 = pessoa3.informarIdade(dataAtual)
                println("${pessoa3.informarNome()} teria $idade3 anos se estivesse vivo(a).")
            }

            4 -> {
                println("Saindo...")
                entrada = true
            }

            else -> {
                println("Opção invalida, tente novamente")
            }
        }
    }
}