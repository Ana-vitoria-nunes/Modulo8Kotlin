package exercicio6
fun main() {
    val guardaVolumes = GuardaVolumes()

    while (true) {
        println("----- MENU -----")
        println("1 - Guardar peças")
        println("2 - Mostrar todas as peças")
        println("3 - Mostrar peças por número de identificação")
        println("4 - Retirar peças por número de identificação")
        println("0 - Sair do programa")
        print("Escolha uma opção: ")
        val opcao = readlnOrNull()?.toIntOrNull()

        when (opcao) {
            1 -> {
                val listaDePecas = mutableListOf<PecaFilha>()
                println("Informe os dados das peças:")
                print("Marca: ")
                val marca = readlnOrNull()
                print("Modelo: ")
                val modelo = readlnOrNull()
                if (!marca.isNullOrBlank() && !modelo.isNullOrBlank()) {
                    listaDePecas.add(PecaFilha(marca, modelo))
                    val numeroIdentificacao = guardaVolumes.guardarPecas(listaDePecas)
                    println("Peças guardadas com sucesso. Número de identificação: $numeroIdentificacao")
                }
                else {
                    println("Invalido, Marca ou modelo esta vazio.")
                }
                println("-----------------------------")
            }
            2 -> {
                println("Peças no Guarda-Volumes:")
                guardaVolumes.mostrarPecas()
                println("-----------------------------")
            }
            3 -> {
                print("Informe o número de identificação: ")
                val numeroIdentificacao = readlnOrNull()?.toIntOrNull()
                if (numeroIdentificacao != null) {
                    guardaVolumes.mostrarPecasComNumero(numeroIdentificacao)
                } else {
                        println("Invalido, numero de identificação esta vazio.")
                }
            }
            4 -> {
                print("Informe o número de identificação: ")
                val numeroIdentificacao = readLine()?.toIntOrNull()
                if (numeroIdentificacao != null) {
                    guardaVolumes.removerPecas(numeroIdentificacao)
                } else {
                    println("Invalido, numero de identificação esta vazio.")
                }
            }
            0 -> {
                println("Saindo do programa...")
                return
            }
            else -> println("Opção inválida. Tente novamente.")
        }
    }
}
