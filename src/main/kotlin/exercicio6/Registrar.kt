package exercicio6

class Registrar {
    companion object {
        fun criarContaSalario(contas: MutableList<Conta>) {
            println("Digite o número da Conta Salário:")
            val numero = readlnOrNull() ?: ""
            println("Digite a senha da Conta Salário:")
            val senha = readlnOrNull() ?: ""
            val conta = ContaSalario(numero, senha)
            contas.add(conta)
            println("Conta Salário $numero criada com sucesso!")
        }

        fun criarContaPoupanca(contas: MutableList<Conta>) {
            println("Digite o número da Conta Poupança:")
            val numero = readlnOrNull() ?: ""
            println("Digite a senha da Conta Poupança:")
            val senha = readlnOrNull() ?: ""
            val conta = ContaPoupanca(numero, senha)
            contas.add(conta)
            println("Conta Poupança $numero criada com sucesso!")
        }

        fun criarContaCorrente(contas: MutableList<Conta>) {
            println("Digite o número da Conta Corrente:")
            val numero = readlnOrNull() ?: ""
            println("Digite a senha da Conta Corrente:")
            val senha = readlnOrNull() ?: ""
            println("Digite o saldo inicial da Conta Corrente:")
            val saldoInicial = readlnOrNull()?.toDoubleOrNull() ?: 0.0
            val conta = ContaCorrente(numero, senha, saldoInicial)
            contas.add(conta)
            println("Conta Corrente $numero criada com sucesso!")
        }

        fun fazerDeposito(contas: List<Conta>) {
            println("Digite o número da conta:")
            val numero = readlnOrNull() ?: ""
            println("Digite a senha da conta:")
            val senha = readlnOrNull() ?: ""

            val conta = contas.find { it.numero == numero && it.senha == senha }
            if (conta != null) {
                println("Digite o valor do depósito:")
                val valor = readlnOrNull()?.toDoubleOrNull() ?: 0.0
                println("O depósito será feito pelo empregador? (S-(sim)/N-(não))")
                val resposta = readln()

                if (resposta=="S") {
                    conta.deposito(valor, Empregador = true)
                } else if (resposta=="N") {
                    conta.deposito(valor, Empregador = false)
                }
                else{
                    println("Opção inválida.")
                }
            } else {
                println("Conta inválida ou senha incorreta.")
            }
        }

        fun fazerSaque(contas: List<Conta>) {
            println("Digite o número da conta:")
            val numero = readlnOrNull() ?: ""
            println("Digite a senha da conta:")
            val senha = readlnOrNull() ?: ""

            val conta = contas.find { it.numero == numero && it.senha == senha }
            if (conta != null) {
                println("Digite o valor do saque:")
                val valor = readln().toDoubleOrNull() ?: 0.0
                conta.saque(valor)

            } else {
                println("Conta inválida ou senha incorreta.")
            }
        }

        fun exibirSaldo(contas: List<Conta>) {
            println("Digite a senha da conta:")
            val senha = readlnOrNull() ?: ""
            val conta = contas.find { it.senha == senha }

            if (conta != null) {
                println("Saldo da Conta: R$ ${conta.saldo}")
            } else {
                println("Senha incorreta. Acesso negado.")
            }
        }
    }
}