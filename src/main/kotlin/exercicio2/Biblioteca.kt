package exercicio2

class Biblioteca() {
    companion object {
        val livro1 = Livro("Frank Herbert", "Duna")
        val livro2 = Livro("Jane Austen", "Orgulho e Preconceito")
        val livro3 = Livro("Suspense", "O Código Da Vinci")

        val romance = mutableListOf<Livro>()
        val terror = mutableListOf<Livro>()
        val comedia = mutableListOf<Livro>()
        fun registrarLivro() {

            println("Digite o nome do livro:")
            val nome = readlnOrNull()?:" "

            println("Digite o autor do livro:")
            val autor = readlnOrNull()?:" "


            println("Qual o genero do livro:\n 1-Romance  2-Comedia  3-Terror")
            val resposta = readln().toIntOrNull()
            when (resposta) {
                1 -> {
                    romance.add(Livro(nome, autor))
                    println("Livro registrado com sucesso!")
                }

                2 -> {
                    comedia.add(Livro(nome, autor))
                    println("Livro registrado com sucesso!")
                }

                3 -> {
                    terror.add(Livro(nome,autor))
                    println("Livro registrado com sucesso!")
                }

                else -> {
                    println("opcção invalida")
                }
            }
        }

        fun mostrarLivros() {
            println("Livros registrados:")
            println("===Romance===")
            romance.add(livro3)
            for (livro in romance) {
                println("Nome do Livro: ${livro.nomeLivro}")
                println("Autor: ${livro.autor}")
                println("---------------------------------")
                println()
            }
            println("===Comedia===")
            comedia.add(livro2)
            for (livro in comedia) {
                println("Nome do Livro: ${livro.nomeLivro}")
                println("Autor: ${livro.autor}")
                println("---------------------------------")
                println()
            }
            println("===Terror===")
            terror.add(livro1)
            for (livro in terror) {
                println("Nome do Livro: ${livro.nomeLivro}")
                println("Autor: ${livro.autor}")
                println("---------------------------------")
            }
        }
    }
}