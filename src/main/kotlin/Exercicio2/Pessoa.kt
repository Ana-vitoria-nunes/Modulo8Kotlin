package Exercicio2

import java.time.LocalDate
import java.time.temporal.ChronoUnit

class Pessoa(val nome: String, val dataNascimento: LocalDate) {
    fun calculaIdade(dataAtual: LocalDate): Long {
        return ChronoUnit.YEARS.between(dataNascimento, dataAtual)
    }

    fun informarIdade(dataAtual: LocalDate): Long {
        return calculaIdade(dataAtual)
    }

    fun informarNome(): String {
        return nome
    }
}


