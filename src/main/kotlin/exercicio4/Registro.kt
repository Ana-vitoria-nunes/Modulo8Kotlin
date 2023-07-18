package exercicio4
class Registro {

    val habitantes = mutableListOf<Habitante>()
    val salarios = mutableListOf<Double>()

    fun cadastrarHabitante() {
        print("Digite o nome do habitante: ")
        val nome = readlnOrNull()
        print("Digite a profissão do habitante: ")
        val profissao = readlnOrNull()
        for (i in 1..12) {
            println("Qual o salario do mês $i:")
            val salario = readln().toDoubleOrNull()
            if (salario == null) {
               println("o salario não pode ser vazio.")
                return
            }
            else {
                salarios.add(salario)
            }
        }
        if (!nome.isNullOrBlank() && !profissao.isNullOrBlank()) {
            habitantes.add(Habitante(nome, profissao, salarios))
            println("Adicionado com sucesso")
        }
        else{
            println("Invalido, nome ou profissão esta vazio.")
        }
    }
    fun mostrarInformacoes(nomeBuscado:String) {
        val habitantesEncontrados = habitantes.filter { it.nome.equals(nomeBuscado, ignoreCase = true) }
        if (habitantesEncontrados.isEmpty()) {
            println("Nenhum habitante encontrado com o nome '$nomeBuscado'.")
        } else {
            for (habitante in habitantesEncontrados) {
                println("Nome: ${habitante.nome}")
                println("Profissão: ${habitante.profissao}")
                println("Salários:")
                for ((indice, salario) in habitante.salarios.withIndex()) {
                    println("Mês ${indice + 1}: $salario")
                }
                println("-----------------------------")
            }
        }
    }
    fun calcularImposto(nomeBuscado:String) {
        val habitantesEncontrados = habitantes.filter { it.nome.equals(nomeBuscado, ignoreCase = true) }
        if (habitantesEncontrados.isEmpty()) {
            println("Nenhum habitante encontrado com o nome '$nomeBuscado'.")
        } else {
            for (habitante in habitantesEncontrados) {
                println("Nome: ${habitante.nome}")
                println("Profissão: ${habitante.profissao}")
                println("Salários:")
                for ((indice, salario) in habitante.salarios.withIndex()) {
                    val imposto: Double = when {
                        salario <= 2000.0 -> 0.0
                        salario <= 3000.0 -> salario * 0.08
                        salario <= 4500.0 -> salario * 0.18
                        else -> salario * 0.28
                    }
                    println("Mês ${indice + 1}- Valor imposto:$imposto|Salario depois do desconto:${salario-imposto}")
                }
                println("-----------------------------")
            }
        }
    }
}