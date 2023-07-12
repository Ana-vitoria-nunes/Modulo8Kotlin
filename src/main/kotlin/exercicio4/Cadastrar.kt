package exercicio4

import java.time.LocalDate
import java.time.format.DateTimeFormatter
class Cadastrar {
    companion object {
        val gerente= ArrayList<Gerente>()
        val programadores= ArrayList<Programadores>()
        fun registrarGerentes() {
            println("Digite o nome do gerente:")
            val nome = readlnOrNull() ?: ""

            println("Digite o salario:")
            val salario = readln().toDouble()

            println("Digite a data de adimissão:")
            val data = readln()
            val dataValidade = try {
                LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"))
            } catch (e: Exception) {
                null
            }
            if (dataValidade!=null){
                gerente.add(Gerente(nome,salario,dataValidade))
                println("Gerente registrado com sucesso!")
            }
            else{
                println("Data invalida digite nesse formato- (dd/MM/yyyy)")
            }

        }
        fun registrarProgramador() {
            println("Digite o nome do Programador:")
            val nome = readlnOrNull() ?: ""

            println("Digite salario:")
            val salario = readln().toDouble()

            println("Digite a data de adimissçao:")
            val data = readln()
            val dataValidade = try {
                LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"))
            } catch (e: Exception) {
                null
            }
            if (dataValidade!=null){
                programadores.add(Programadores(nome,salario,dataValidade))
                println("Programador registrado com sucesso!")
            }
            else{
                println("Data invalida digite nesse formato- (dd/MM/yyyy)")
            }

        }
        fun mostrarTimesRegistrados() {
            for (times in gerente) {
                times.exibirInformacoes()
            }
            for (times in programadores) {
                times.exibirInformacoes()
            }
        }
    }
}