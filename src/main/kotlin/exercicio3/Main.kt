package exercicio3

fun main() {
    val dicionario = Dicionario()
    do {
        println("Selecione uma opção:")
        println("1. Adicionar termo")
        println("2. Procurar termo")
        println("3. Listar todos os termos")
        println("4. Sair")
        val opcao = readlnOrNull()?.toIntOrNull()

        when (opcao) {
            1 -> {
                println("Digite o termo:")
                val termo = readlnOrNull()
                println("Digite a descrição do termo:")
                val descricao = readlnOrNull()
                if (!termo.isNullOrEmpty() && !descricao.isNullOrEmpty()) {
                    dicionario.adicionarTermo(termo, descricao)
                    println("Termo e descrição adicionado com sucesso!")
                } else {
                    println("Invalido, termo ou descrição esta vazio.")
                }
            }
            2 -> {
                println("Digite o termo a ser procurado:")
                val termo = readlnOrNull()
                if (termo != null) {
                    dicionario.procurarTermo(termo)
                }
            }
            3 -> {
                println("Lista de termos:")
                dicionario.listarTermos()
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