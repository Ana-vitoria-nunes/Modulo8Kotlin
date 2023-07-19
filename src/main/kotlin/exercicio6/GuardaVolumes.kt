package exercicio6
class GuardaVolumes {
    val dicionario = mutableMapOf<Int, ArrayList<PecaFilha>>()
    var contador = 1

    fun guardarPecas(listaDePecas: ArrayList<PecaFilha>): Int {
        dicionario[contador] = listaDePecas
        return contador++
    }
    fun mostrarPecas() {
        for ((numero, pecas) in dicionario) {
            println("Número de identificação: $numero")
            for (peca in pecas) {
                println("Marca: ${peca.marca} | Modelo: ${peca.modelo}")
            }
            println("-----------------------------")
        }
    }
    fun mostrarPecasComNumero(numero: Int) {
        val pecas = dicionario[numero]
        if (pecas != null) {
            println("Número de identificação: $numero")
            for (peca in pecas) {
                println("Marca: ${peca.marca}, Modelo: ${peca.modelo}")
            }
        } else {
            println("Número de identificação não encontrado.")
        }
        println("-----------------------------")
    }

    fun removerPecas(numero: Int) {
        val pecas = dicionario.remove(numero)
        if (pecas != null) {
            for (peca in pecas) {
              PecaFilha(peca.modelo,peca.marca).retirada()
            }
        } else {
            println("Número de identificação não encontrado.")
        }
        println("-----------------------------")
    }
}
