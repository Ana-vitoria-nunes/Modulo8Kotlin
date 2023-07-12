package exercicio3

fun main() {

    var opcao= 0
    while (opcao != 4) {
        println("----- MENU -----")
        println("1. Registrar Time de Futebol")
        println("2. Registrar Time de Basquete")
        println("3. Mostrar tomes registrados")
        println("4. Sair")
        println("Digite a opção desejada:")
        opcao = readlnOrNull()?.toIntOrNull() ?: 0

        when (opcao) {
            1 -> Registrar.registrarTimeFutebol()
            2 ->Registrar.registrarTimeBasquete()
            3 ->Registrar.mostrarTimesRegistrados()
            4 -> println("Saindo do programa...")
            else -> println("Opção inválida. Tente novamente.")
        }

        println()
    }
}