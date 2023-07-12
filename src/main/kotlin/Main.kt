abstract class ContaBancaria(val numero: String, val senha: String, var saldo: Double) {
    abstract fun deposito(valor: Double, isEmpregador: Boolean)
    abstract fun saque(valor: Double)
    abstract fun exibirSaldo()
}

class ContaSalario(numero: String, senha: String) : ContaBancaria(numero, senha, 1045.0) {
    override fun deposito(valor: Double, isEmpregador: Boolean) {
        if (isEmpregador) {
            println("Depósito de R$ $valor realizado na Conta Salário $numero.")
        } else {
            println("Conta Salário só pode receber depósito do empregador.")
        }
    }

    override fun saque(valor: Double) {
        if (saldo - valor >= 0) {
            println("Saque de R$ $valor realizado na Conta Salário $numero.")
        } else {
            println("Saldo insuficiente.")
        }
    }

    override fun exibirSaldo() {
        println("Saldo da Conta Salário $numero: R$ $saldo")
    }
}

class ContaPoupanca(numero: String, senha: String) : ContaBancaria(numero, senha, 0.0) {
    override fun deposito(valor: Double, isEmpregador: Boolean) {
        if (isEmpregador) {
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

class ContaCorrente(numero: String, senha: String, saldoInicial: Double) : ContaBancaria(numero, senha, saldoInicial) {
    override fun deposito(valor: Double, isEmpregador: Boolean) {
        if (valor > 5000.0) {
            println("Operação inválida, procure a sua agência.")
        } else {
            println("Depósito de R$ $valor realizado na Conta Corrente $numero.")
            saldo += valor
        }
    }

    override fun saque(valor: Double) {
        println("Saque de R$ $valor realizado na Conta Corrente $numero.")
        saldo -= valor
    }

    override fun exibirSaldo() {
        println("Saldo da Conta Corrente $numero: R$ $saldo")
    }
}

fun main() {
    val contas = mutableListOf<ContaBancaria>()

    var opcao: Int
    do {
        println("----- MENU -----")
        println("1. Criar Conta Salário")
        println("2. Criar Conta Poupança")
        println("3. Criar Conta Corrente")
        println("4. Fazer Depósito")
        println("5. Fazer Saque")
        println("6. Exibir Saldo")
        println("7. Sair")
        println("Digite a opção desejada:")
        opcao = readLine()?.toIntOrNull() ?: 0

        when (opcao) {
            1 -> criarContaSalario(contas)
            2 -> criarContaPoupanca(contas)
            3 -> criarContaCorrente(contas)
            4 -> fazerDeposito(contas)
            5 -> fazerSaque(contas)
            6 -> exibirSaldo(contas)
            7 -> println("Saindo do programa...")
            else -> println("Opção inválida. Tente novamente.")
        }

        println()
    } while (opcao != 7)
}

fun criarContaSalario(contas: MutableList<ContaBancaria>) {
    println("Digite o número da Conta Salário:")
    val numero = readLine() ?: ""
    println("Digite a senha da Conta Salário:")
    val senha = readLine() ?: ""
    val conta = ContaSalario(numero, senha)
    contas.add(conta)
    println("Conta Salário $numero criada com sucesso!")
}

fun criarContaPoupanca(contas: MutableList<ContaBancaria>) {
    println("Digite o número da Conta Poupança:")
    val numero = readLine() ?: ""
    println("Digite a senha da Conta Poupança:")
    val senha = readLine() ?: ""
    val conta = ContaPoupanca(numero, senha)
    contas.add(conta)
    println("Conta Poupança $numero criada com sucesso!")
}

fun criarContaCorrente(contas: MutableList<ContaBancaria>) {
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

fun fazerDeposito(contas: List<ContaBancaria>) {
    println("Digite o número da conta:")
    val numero = readLine() ?: ""
    println("Digite a senha da conta:")
    val senha = readLine() ?: ""

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

fun fazerSaque(contas: List<ContaBancaria>) {
    println("Digite o número da conta:")
    val numero = readLine() ?: ""
    println("Digite a senha da conta:")
    val senha = readLine() ?: ""

    val conta = contas.find { it.numero == numero && it.senha == senha }
    if (conta != null) {
        println("Digite o valor do saque:")
        val valor = readLine()?.toDoubleOrNull() ?: 0.0
        conta.saque(valor)
    } else {
        println("Conta inválida ou senha incorreta.")
    }
}

fun exibirSaldo(contas: List<ContaBancaria>) {
    println("Digite o número da conta:")
    val numero = readLine() ?: ""
    println("Digite a senha da conta:")
    val senha = readLine() ?: ""

    val conta = contas.find { it.numero == numero && it.senha == senha }
    if (conta != null) {
        conta.exibirSaldo()
    } else {
        println("Conta inválida ou senha incorreta.")
    }
}
