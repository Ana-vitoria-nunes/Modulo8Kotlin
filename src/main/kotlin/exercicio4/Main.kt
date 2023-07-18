package exercicio4
fun main() {
    val registro=Registro()
    do {
        println("Selecione uma opção:")
        println("1. Cadastrar")
        println("2. Mostrar informações ")
        println("3. Calcular imposto de cada mês")
        println("4. Sair")
        val opcao = readln().toIntOrNull()

        when (opcao) {
            1 -> {
                registro.cadastrarHabitante()
            }
            2 -> {
                println("Qual o nome do habitante que você deseja ver informações:")
                val nome= readlnOrNull()
                if (!nome.isNullOrBlank()) {

                    registro.mostrarInformacoes(nome)
                }
            }
            3 -> {
                println("Qual o nome do habitante que você deseja calcular impostos:")
                val nome= readlnOrNull()
                if (!nome.isNullOrBlank()) {
                    registro.calcularImposto(nome)
                }
            }
            4 -> {
                println("Saindo do programa...")
                break
            }
            else -> {
                println("Opção inválida. Tente novamente.")
            }
        }
    } while (true)
}