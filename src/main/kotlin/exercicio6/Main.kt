package exercicio6

fun main() {
    val contas = mutableListOf<Conta>()

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
            1 -> Registrar.criarContaSalario(contas)
            2 -> Registrar.criarContaPoupanca(contas)
            3 -> Registrar.criarContaCorrente(contas)
            4 -> Registrar.fazerDeposito(contas)
            5 -> Registrar.fazerSaque(contas)
            6 -> Registrar.exibirSaldo(contas)
            7 -> println("Saindo do programa...")
            else -> println("Opção inválida. Tente novamente.")
        }

        println()
    }while (opcao != 7)
}