package exercicio1
import java.time.LocalDate
class Produto(val nome:String,val codigo:String,val dataValidade:LocalDate) {

    override fun toString(): String {
        return "nome:$nome\ncodigo:$codigo\ndataValidade:$dataValidade"
    }
}