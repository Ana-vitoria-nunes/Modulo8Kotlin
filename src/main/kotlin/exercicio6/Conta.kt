package exercicio6

open class Conta(val numero: String, val senha: String, var saldo: Double) {
    open fun deposito(valor: Double, Empregador: Boolean){
    }
   open fun saque(valor: Double){

   }
    open fun exibirSaldo(){

    }

}