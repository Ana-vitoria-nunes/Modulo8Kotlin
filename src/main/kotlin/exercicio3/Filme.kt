package exercicio3
class Filme(val titulo:String, val duracaoMin:Int) {
    fun mostrarDuracaoEmHoras(){
        val horas = duracaoMin / 60
        val minutos = duracaoMin % 60
        println("O filme $titulo possui $horas horas e $minutos minutos de duração.\n")
    }

}