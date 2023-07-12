package exercicio2
fun main() {

    var opcao: Int
    do {
        println("----- MENU -----")
        println("1. Registrar livro")
        println("2. Mostrar livros registrados")
        println("3. Sair")
        println("Digite a opção desejada:")
        opcao = readLine()?.toIntOrNull() ?: 0

        when (opcao) {
            1 -> Biblioteca.registrarLivro()
            2 -> Biblioteca.mostrarLivros()
            3 -> println("Saindo do programa...")
            else -> println("Opção inválida. Tente novamente.")
        }

        println()
    } while (opcao != 3)
}