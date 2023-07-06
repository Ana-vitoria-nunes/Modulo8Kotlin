package exercicio1
class Funcionario(val nome:String, val sobrenome:String, var horasTrabalhadas:Int,val valorHora:Double) {
    fun nomeCompleto(){
        println("Nome completo: $nome $sobrenome")
    }
    fun calcularSalario(){
        println("Recebera por mês ${horasTrabalhadas*valorHora}")
    }
    fun incrementarHoras(hora:Int): Int{
        horasTrabalhadas+=hora
        return horasTrabalhadas
    }

}