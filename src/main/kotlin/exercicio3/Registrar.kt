package exercicio3

class Registrar {

    companion object {
        val timeF= ArrayList<Futebol>()
        val timeB= ArrayList<Basquete>()
        fun registrarTimeFutebol() {
            println("Digite o nome do time de Futebol:")
            val nome = readLine() ?: ""

            println("Digite o número de jogadores:")
            val jogadores = readLine()?.toIntOrNull() ?: 0

            println("Digite o número de vitórias:")
            val vitorias = readLine()?.toIntOrNull() ?: 0

            val time = Futebol(nome, jogadores, vitorias)
            timeF.add(time)

            println("Time de Futebol registrado com sucesso!")
        }
        fun registrarTimeBasquete() {
            println("Digite o nome do time de Basquete:")
            val nome = readlnOrNull() ?: ""

            println("Digite o número de jogadores:")
            val jogadores = readLine()?.toIntOrNull() ?: 0

            println("Digite o número de vitórias em 2022:")
            val vitorias = readLine()?.toIntOrNull() ?: 0

            val time = Basquete(nome, jogadores, vitorias)
            timeB.add(time)
            println("Time de Basquete registrado com sucesso!")
        }
        fun mostrarTimesRegistrados() {
            println("Gerentes:")
            for (times in timeB) {
                times.exibirInformacoes()
            }
            println("Programadores:")
            for (times in timeF) {
                times.exibirInformacoes()
            }
        }
    }
}