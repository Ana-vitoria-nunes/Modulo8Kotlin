package exercicio6

class ContaSalario  (numero: String, senha: String) : Conta(numero, senha, 1212.0){

        override fun deposito(valor: Double, empregador: Boolean) {
            if (empregador) {
                println("Depósito de R$ $valor realizado na Conta Salário.")
                saldo+=valor
            } else {
                println("Conta Salário só pode receber depósito do empregador.")
            }
        }

        override fun saque(valor: Double) {
            if (saldo - valor >= 0) {
                println("Saque de R$ $valor realizado na Conta Salário.")
            } else {
                println("Saldo insuficiente.")
            }
        }

        override fun exibirSaldo() {
            println("Saldo da Conta Salário: R$ $saldo")
        }
}