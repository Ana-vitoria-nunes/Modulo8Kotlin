package Exercicio1
abstract class Loja(val nome: String, val preco: Double, val codigo: String?){
    open fun mostrarDetalhe(){
         println("Nome: $nome\nPreço: R$ $preco\nCodigo: R\$ $preco")
     }

    override fun equals(other: Any?): Boolean {
        return when(other){
            is Loja ->{
                this.codigo==other.codigo
            }
            else ->false
        }
    }

}