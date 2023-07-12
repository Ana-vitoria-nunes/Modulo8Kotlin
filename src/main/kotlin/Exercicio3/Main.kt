package Exercicio3
fun main() {
    val aluno = Aluno()
    println("=====Bem vindo(a)=====")
    aluno.lançarNotas()
    var entrada = false
    while (!entrada) {
            println("Deseja fazer um novo cálculo (1-sim 2-não):")
            val res = readLine()?.toIntOrNull()

            if (res==1){
                aluno.limparNotas()
                aluno.lançarNotas()
                continue
            }
            else if (res==2){
                println("Encerrando o programa...")
                entrada = true
            }
            else{
                println("Opção inválida. Por favor, informe 1 para novo cálculo ou 2 para encerrar.")
            }

//            when (res) {
//                1 -> {
//                    aluno.limparNotas()
//                    continue
//                }
//
//                2 -> {
//                    println("Encerrando o programa...")
//                    entrada = true
//                }
//
//                else -> {
//                    println("Opção inválida. Por favor, informe 1 para novo cálculo ou 2 para encerrar.")
//                    continue
//                }

    }
}


