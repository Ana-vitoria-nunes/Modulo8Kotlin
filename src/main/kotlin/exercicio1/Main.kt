package exercicio1
fun main() {
  var opcao: Int
  do {
    println("----- MENU -----")
    println("1. Comprar produto")
    println("2. Mostrar produtos comprados")
    println("3. Sair")
    println("Digite a opção desejada:")
    opcao = readLine()?.toIntOrNull() ?: 0

    when (opcao) {
      1 -> SuperMercado.comprar()
      2 -> SuperMercado.listaCompras()
      3 -> println("Saindo do programa...\n")
      else -> println("Opção inválida. Tente novamente.")
    }
    println()
  } while (opcao != 3)
}