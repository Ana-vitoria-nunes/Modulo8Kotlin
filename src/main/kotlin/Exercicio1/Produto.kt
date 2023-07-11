package Exercicio1

class Produto(
    protected val nome: String,
    protected val valor: Double,
    protected val quant: Int) {

    var quantidade = quant
        get() {
            return field
        }
    val nomes = nome
        get() {
            return field
        }
    val valores = valor
        get() {
            return field
        }

}