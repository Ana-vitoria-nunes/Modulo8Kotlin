package exercicio5
class Registrar {
    companion object{
        val cachorros = mutableListOf<Cachorro>()
        val gatos = mutableListOf<Gato>()
        val passarinhos = mutableListOf<Passarinho>()
        val cachorro1 = Cachorro("Max", "Labrador Retriever", "João")
        val cachorro2 = Cachorro("Luna", "Golden Retriever", "Maria")

        val gato1 = Gato("Tom", "Persa", "Carlos")
        val gato2 = Gato("Mia", "Siamese", "Laura")

        val passarinho1 = Passarinho("Pipo", "Canário", "Pedro")
        val passarinho2 = Passarinho("Lola", "Calopsita", "Ana")


        fun registrarCachorro() {
            println("Digite o nome do cachorro:")
            val nome = readlnOrNull() ?: ""

            println("Digite a raça do cachorro:")
            val raca = readlnOrNull() ?: ""

            println("Digite o nome do responsável:")
            val responsavel = readlnOrNull() ?: ""

            val cachorro = Cachorro(nome, raca, responsavel)
            cachorros.add(cachorro)

            println("Cachorro registrado com sucesso!")
        }

        fun registrarGato() {
            println("Digite o nome do gato:")
            val nome = readlnOrNull() ?: ""

            println("Digite a raça do gato:")
            val raca = readlnOrNull() ?: ""

            println("Digite o nome do responsável:")
            val responsavel = readlnOrNull() ?: ""

            val gato = Gato(nome, raca, responsavel)
            gatos.add(gato)

            println("Gato registrado com sucesso!")
        }
        fun registrarPassarinho() {
            println("Digite o nome do passarinho:")
            val nome = readlnOrNull() ?: ""

            println("Digite a raça do passarinho:")
            val raca = readlnOrNull() ?: ""

            println("Digite o nome do responsável:")
            val responsavel = readlnOrNull() ?: ""

            val passarinho = Passarinho(nome, raca, responsavel)
            passarinhos.add(passarinho)

            println("Passarinho registrado com sucesso!")
        }

        fun mostrarAnimaisRegistrados() {
            println("Animais Registrados:")
            println("=====Cachorros=====")
            cachorros.add(cachorro1)
            cachorros.add(cachorro2)
            for (animal in cachorros) {
                animal.movimentar()
                animal.comer()
                animal.dormir()
                println()
            }
            println("=====Gatos=====")
            gatos.add(gato1)
            gatos.add(gato2)
            for (animal in gatos) {
                animal.movimentar()
                animal.comer()
                animal.dormir()
                println()
            }
            println("=====Passarinhos=====")
            passarinhos.add(passarinho1)
            passarinhos.add(passarinho2)
            for (animal in passarinhos) {
                animal.movimentar()
                animal.comer()
                animal.dormir()
                println()
            }
        }
    }
}