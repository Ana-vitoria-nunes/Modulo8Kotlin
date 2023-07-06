package exercicio1
import kotlin.random.Random
fun main() {
    val novoFuncionario=Funcionario("Luis","Silva",10,25.50)
    novoFuncionario.nomeCompleto()
    novoFuncionario.calcularSalario()
    novoFuncionario.incrementarHoras(8)
    novoFuncionario.calcularSalario()
    println()

    val funcionarios = ArrayList<Funcionario>()
    val nomes = arrayOf("Lais", "Ricardo", "Lumiar", "Ana", "Daniel","Paola")
    val sobrenomes = arrayOf("Silva", "Santos", "Lima", "Pereira", "Ferreira","Nunes")

    for (i in 1..9) {
        val nomeAleatorio = nomes.random()
        val sobrenomeAleatorio = sobrenomes.random()
        val horasTrabalhadas = Random.nextInt(0, 40)

        val funcionario = Funcionario(nomeAleatorio,sobrenomeAleatorio,horasTrabalhadas,25.50)
        funcionarios.add(funcionario)
    }
    println("======Lista======")
    for (funcionario in funcionarios) {
        val incrementarHora = Random.nextInt(0, 50)
        println("Nome: ${funcionario.nome} ${funcionario.sobrenome}")
        println("Horas trabalhada: ${funcionario.horasTrabalhadas}")
        funcionario.calcularSalario()
        funcionario.incrementarHoras(incrementarHora)
        println("Salario depois do incremento de $incrementarHora")
        funcionario.calcularSalario()

        println("-----------")
    }

}