package exercicio3
 open class Time(val nome:String,val quantidadeJogadores:Int,val quantidadeVitorias:Int,val tipoEsporte:String) {

     open fun exibirInformacoes() {
         println("Nome do Time: $nome")
         println("Número de Jogadores: $quantidadeJogadores")
         println("Vitórias: $quantidadeVitorias")
         println("Esporte: $tipoEsporte")
         println()
     }


 }