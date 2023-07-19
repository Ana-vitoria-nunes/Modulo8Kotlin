package exercicio1

fun main() {
    val calculo = Calculo()
    var cont=false
    while (!cont) {
        println("=====Menu=====")
        println("1-Dividir   2-Sair")
        val resposta= readln().toInt()

        when(resposta){
            1->{
                println("Digite o numero do divedendo:")
                val dividendo = readln().toInt()
                println("Digite o numero do divisor:")
                val divisor = readln().toInt()
                println(calculo.divisao(divisor, dividendo))}
            2->{
                println("Encerrando...")
                cont=true }
            else ->println("opção invalida")
        }
    }

}