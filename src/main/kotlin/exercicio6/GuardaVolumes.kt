package exercicio6
class GuardaVolumes {
    val dicionario = mutableMapOf<Int, MutableList<PecaFilha>>()
    var contador = 1

    fun guardarPecas(listaDePecas: MutableList<PecaFilha>): Int {
        dicionario[contador] = listaDePecas
        return contador++
    }
    fun mostrarPecas() {
        for ((numero, pecas) in dicionario) {
            println("Número de identificação: $numero")
            for (peca in pecas) {
                println("Marca: ${peca.marca}, Modelo: ${peca.modelo}")
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
        if (dicionario.containsKey(numero)) {
            dicionario.remove(numero)
            println("Peças removidas do número de identificação: $numero")
        } else {
            println("Número de identificação não encontrado.")
        }
        println("-----------------------------")
    }
}
