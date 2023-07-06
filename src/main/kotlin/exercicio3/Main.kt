package exercicio3
fun main() {
    println()
    val filme1=Filme("Os Vingadores",142)
    filme1.mostrarDuracaoEmHoras()
    val filme2=Filme("Hotel Transilvânia",93)
    filme2.mostrarDuracaoEmHoras()
    println("Os filmes em cartaz são ${filme1.titulo} e ${filme2.titulo}\n")

    val filmes = arrayOf(
        Filme("O Poderoso Chefão", 120),
        Filme("A Origem", 90),
        Filme("Matrix", 105),
        Filme("De Volta para o Futuro", 135),
        Filme("Titanic", 150)
    )
    var i=0
    for (filme in filmes) {
        println("Filme ${i+1}")
        i++
        filme.mostrarDuracaoEmHoras()
        println("-----------------------------------------")
    }
}