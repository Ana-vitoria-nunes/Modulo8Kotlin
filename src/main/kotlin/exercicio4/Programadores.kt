package exercicio4

import java.time.LocalDate

class Programadores(nome:String, salario:Double, dataAdimissao: LocalDate):Funcionario(nome,salario,dataAdimissao,"Administrativo") {

    override fun exibirInformacoes() {
        println("=====Programador=====")
        super.exibirInformacoes()
    }
}