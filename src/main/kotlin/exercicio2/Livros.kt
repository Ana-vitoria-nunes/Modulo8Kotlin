package exercicio2
import kotlin.random.Random
class Livros(val titulo:String,var qtdPaginas:Int, var paginasLidas:Int) {
    fun verificarProgresso(){
        val porcentagem=paginasLidas*100/qtdPaginas
        println("Você já leu $porcentagem% do livro.")
    }
}
fun main(){

    val livrofavorito=Livros("O Pequeno Príncipe",98,20)

    println("O livro ${livrofavorito.titulo} possui ${livrofavorito.qtdPaginas} páginas")

    livrofavorito.verificarProgresso()

    livrofavorito.paginasLidas = 50
    livrofavorito.verificarProgresso()
    println()

    val livrosNovos = ArrayList<Livros>()
    val nomeLivros = arrayOf("O Voo","Caminhos","Segredos","Luz e Sombra","Ponto de Virada","Além do Horizonte"
        ,"A Jornada", "Reflexos","Sussurros","Despertar")

    for (i in 1..10) {
        val nomeAleatorio = nomeLivros.random()
        val qntPaginas = Random.nextInt(1, 100)
        val paginaLidas = Random.nextInt(0, qntPaginas)


        val livro = Livros( nomeAleatorio, qntPaginas, paginaLidas)
        livrosNovos.add(livro)
    }
    println("======Lista======")
    for (livro in livrosNovos) {
        println("O livro ${livro.titulo} possui ${livro.qtdPaginas} páginas")
        println("paginas lidas: ${livro.paginasLidas} ")
        livro.verificarProgresso()
        println("----------------------")
    }
}