package Exercicio1

fun main() {

    Caixa.adicionarproduto()
    var entrada = false
    while (!entrada) {
        println("=====Bem Vindo(a)=====")
        println("Você deseja entra como:\n1-Funcionario  2-Cliente  3-sair")
        val resposta = readln().toIntOrNull()
        if (resposta == 1) {
            Caixa.cadastrarProduto()
        } else if (resposta == 2) {
            Caixa.mostraProduto()
            Caixa.comprar()
        } else if (resposta == 3) {
            println("Saindo...")
            entrada = true
        } else {
            println("Opção invalida")
        }
    }
}