package exercicio3

class Dicionario {
    val dicionario= mutableMapOf<String,String>(
        "andar" to "lallala",
        "comer" to "babababa",
        "boca" to "popopopo",
        "amor" to "rerrdfdr"

    )

    fun adicionarTermo(termo: String,descricao:String) {
        dicionario[termo]=descricao

    }
    fun procurarTermo(termo: String) {
        val descricao = dicionario[termo]
        if (descricao != null) {
            println("Descrição do termo \"$termo\": $descricao")
        } else {
            println("Termo não encontrado.")
        }
    }
    fun listarTermos() {
        for (termo in dicionario.toSortedMap()) {
            println(termo)
        }
    }
}
