package exercicio6

class Registrar {
    companion object {
        fun criarContaSalario(contas: MutableList<Conta>) {
            println("Digite o número da Conta Salário:")
            val numero = readLine() ?: ""
            println("Digite a senha da Conta Salário:")
            val senha = readLine() ?: ""
            val conta = ContaSalario(numero, senha)
            contas.add(conta)
            println("Conta Salário $numero criada com sucesso!")
        }

        fun criarContaPoupanca(contas: MutableList<Conta>) {
            println("Digite o número da Conta Poupança:")
            val numero = readLine() ?: ""
            println("Digite a senha da Conta Poupança:")
            val senha = readLine() ?: ""
            val conta = ContaPoupanca(numero, senha)
            contas.add(conta)
            println("Conta Poupança $numero criada com sucesso!")
        }

        fun criarContaCorrente(contas: MutableList<Conta>) {
            println("Digite o número da Conta Corrente:")
            val numero = readLine() ?: ""
            println("Digite a senha da Conta Corrente:")
            val senha = readLine() ?: ""
            println("Digite o saldo inicial da Conta Corrente:")
            val saldoInicial = readLine()?.toDoubleOrNull() ?: 0.0
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
                val valor = readLine()?.toDoubleOrNull() ?: 0.0
                println("O depósito será feito pelo empregador? (S/N)")
                val resposta = readLine()?.toUpperCase()

                if (resposta == "S") {
                    conta.deposito(valor, isEmpregador = true)
                } else {
                    conta.deposito(valor, isEmpregador = false)
                }
            } else {
                println("Conta inválida ou senha incorreta.")
            }
        }

        fun fazerSaque(contas: List<Conta>) {
            println("Selecione o número da conta:")
            for (i in contas.indices) {
                println("$i. Conta ${contas[i].javaClass.simpleName}")
            }
            val opcao = readlnOrNull()?.toIntOrNull()

            if (opcao != null && opcao in contas.indices) {
                val conta = contas[opcao]
                println("Digite o valor do saque:")
                val valor = readlnOrNull()?.toDoubleOrNull() ?: 0.0
                conta.saque(valor)
            } else {
                println("Conta inválida.")
            }
        }

        fun exibirSaldo(contas: List<Conta>) {
            println("Selecione o número da conta:")
            for (i in contas.indices) {
                println("$i. Conta ${contas[i].javaClass.simpleName}")
            }
            val opcao = readlnOrNull()?.toIntOrNull()

            if (opcao != null && opcao in contas.indices) {
                val conta = contas[opcao]
                conta.exibirSaldo()
            } else {
                println("Conta inválida.")
            }
        }
    }
}