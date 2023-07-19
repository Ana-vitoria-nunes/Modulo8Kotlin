package exercicio2
class ListaMercado {

    private val listaVerdura = HashMap<String, Double>()
    private val listaLegumes = HashMap<String, Int>()
    private val listaGrao = HashMap<String, Double>()
    private val listaOutros = HashMap<String, Int>()

    fun comprarVerdura() {
        println("Quantas gramas de verdura você deseja? ")
        val quantidade = readln()
        val input = quantidade.replace(".",".").toDoubleOrNull()
        if (input == null) {
            throw NumberFormatException("Para verdura, a quantidade deve ser informada com ponto.")
        }
        println("Qual Verdura? ")
        val nome = readln()
        if (nome.isEmpty()) {
            throw UnsupportedOperationException("Não é permitido inserir nome vazio.")
        }
        println("Compra realizada com sucesso")
        listaVerdura[nome] = input
    }

    fun comprarLegumes() {

        println("Quantos legumes você deseja? ")
        val quantidade = readln().toInt()
        if (quantidade <= 0) {
            throw UnsupportedOperationException("Não é possível inserir número negativo ou zero.")
        }
        println("Qual Legume? ")
        val nome = readln()
        if (nome.isEmpty()) {
            throw UnsupportedOperationException("Não é permitido inserir nome vazio.")
        }
        println("Compra realizada com sucesso")
        listaLegumes[nome] = quantidade
    }

    fun comprarGraos() {
        println("Quantas gramas de grão você deseja? ")
        val quantidade = readln().toDouble()
        if (quantidade % 1 == 0.0) {
            throw NumberFormatException("Para grãos, a quantidade deve ser informada com ponto.")
        }
        println("Qual Grão? ")
        val nome = readln()
        if (nome.isEmpty()) {
            throw UnsupportedOperationException("Não é permitido inserir nome vazio.")
        }
        println("Compra realizada com sucesso")
        listaGrao[nome] = quantidade
    }

    fun comprarOutros() {
        println("Quantas unidades desse produto você deseja? ")
        val quantidade = readln().toInt()
        if (quantidade <= 0) {
            throw UnsupportedOperationException("Não é possível inserir número negativo ou zero.")
        }
        println("Qual Produto? ")
        val nome = readln()
        if (nome.isEmpty()) {
            throw UnsupportedOperationException("Não é permitido inserir nome vazio.")
        }
        println("Compra realizada com sucesso")
        listaOutros[nome] = quantidade
    }

    fun listarEFinalizar() {
        println("------------Lista Mercado-------------")
        println("Quantidade de legumes: " + listaLegumes.size)
        listaLegumes.forEach { (k, v) -> println("Produto: $k Kg | Quantidade: $v") }

        println("\nQuantidade de verdura: " + listaVerdura.size)
        listaVerdura.forEach { (k, v) -> println("Produto: $k | Quantidade: $v") }

        println("\nQuantidade de grãos: " + listaGrao.size)
        listaGrao.forEach { (k, v) -> println("Produto: $k Kg | Quantidade: $v") }

        println("\nQuantidade de outros: " + listaOutros.size)
        listaOutros.forEach { (k, v) -> println("Produto: $k | Quantidade: $v") }
    }
}
