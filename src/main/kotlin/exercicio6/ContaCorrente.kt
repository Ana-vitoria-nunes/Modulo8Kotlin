package exercicio6

class ContaCorrente(numero: String, senha: String, saldoInicial: Double) : Conta(numero, senha, saldoInicial)  {

        override fun deposito(valor: Double, Empregador: Boolean) {
            if (valor > 5000.0) {
                println("Operação inválida, procure a sua agência.")
            } else {
                println("Depósito de R$ $valor realizado na Conta Corrente.")
                saldo += valor
            }
        }

        override fun saque(valor: Double) {
            println("Saque de R$ $valor realizado na Conta Corrente.")
            saldo -= valor
        }

        override fun exibirSaldo() {
            println("Saldo da Conta Corrente: R$ $saldo")
        }

}
