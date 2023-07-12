package exercicio4

import java.time.LocalDate

class Gerente(nome:String,salario:Double, dataAdimissao: LocalDate):Funcionario(nome,salario,dataAdimissao,"Comercial") {

    override fun exibirInformacoes() {
        println("=====Gerentes=====")
        super.exibirInformacoes()
    }
}