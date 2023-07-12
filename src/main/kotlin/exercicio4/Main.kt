package exercicio4

fun main() {
    var opcao= 0
    while (opcao != 4) {
        println("----- MENU -----")
        println("1. Registrar Gerente")
        println("2. Registrar Programador")
        println("3. Mostrar Funcionarios Registrados")
        println("4. Sair")
        println("Digite a opção desejada:")
        opcao = readlnOrNull()?.toIntOrNull() ?: 0

        when (opcao) {
            1 -> Cadastrar.registrarGerentes()
            2 -> Cadastrar.registrarProgramador()
            3 -> Cadastrar.mostrarTimesRegistrados()
            4 -> println("Saindo do programa...")
            else -> println("Opção inválida. Tente novamente.")
        }

        println()
    }
}