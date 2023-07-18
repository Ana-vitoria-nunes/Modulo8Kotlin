package exercicio2

fun main() {
    val lista= mutableSetOf<Int>()
    lista.add(1)
    lista.add(5)
    lista.add(5)
    lista.add(6)
    lista.add(7)
    lista.add(8)
    lista.add(8)
    lista.add(8)

    println(lista)

    //O set não permite valores repetidos

}