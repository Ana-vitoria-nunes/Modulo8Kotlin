package Exercicio1
import kotlin.time.Duration.Companion.minutes
class DVDs(nome: String, preco: Double, codigo: String?, val duracao: Int) : Loja(nome, preco,codigo) {
    override fun mostrarDetalhe() {
        val hora=duracao.minutes
        super.mostrarDetalhe()
        println("Duração: $hora")
    }
}