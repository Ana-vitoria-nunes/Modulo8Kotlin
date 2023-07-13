package exercicio6

class ContaPoupanca(numero: String, senha: String) : Conta(numero, senha, 0.0) {

    override fun deposito(valor: Double, Empregador: Boolean) {
        if (Empregador) {
            println("Depósito de R$ $valor realizado na Conta Poupança $numero.")
            saldo += valor
        } else {
            println("Conta Poupança só pode receber depósito do empregador.")
        }
    }

    override fun saque(valor: Double) {
        if (saldo - valor >= 0) {
            println("Saque de R$ $valor realizado na Conta Poupança $numero.")
            saldo -= valor
        } else {
            println("Saldo insuficiente.")
        }
    }

    override fun exibirSaldo() {
        println("Saldo da Conta Poupança $numero: R$ $saldo")
    }
}