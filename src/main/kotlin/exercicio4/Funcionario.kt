package exercicio4
import java.time.LocalDate
open class Funcionario(val nome:String,val salario:Double,val dataAdimissao:LocalDate,val setor:String) {
    open fun exibirInformacoes() {
        println("Nome Funcionario: $nome")
        println("Salario: $salario")
        println("Data de adimissão: $dataAdimissao")
        println("Setor: $setor")
        println()
    }
}