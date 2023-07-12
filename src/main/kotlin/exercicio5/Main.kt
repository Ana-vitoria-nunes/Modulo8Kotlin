package exercicio5

fun main() {

    var opcao: Int
    do {
        println("----- MENU -----")
        println("1. Registrar Cachorro")
        println("2. Registrar Gato")
        println("3. Registrar Passarinho")
        println("4. Mostrar Animais Registrados")
        println("5. Sair")
        println("Digite a opção desejada:")
        opcao = readLine()?.toIntOrNull() ?: 0

        when (opcao) {
            1 -> Registrar.registrarCachorro()
            2 -> Registrar.registrarGato()
            3 -> Registrar.registrarPassarinho()
            4 -> Registrar.mostrarAnimaisRegistrados()
            5 -> println("Saindo do programa...")
            else -> println("Opção inválida. Tente novamente.")
        }

        println()
    } while (opcao != 5)
}