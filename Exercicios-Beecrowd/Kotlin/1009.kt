import java.util.*

fun main(args: Array<String>) {

	    val nome= readLine()
    val valor1= readLine()
    val valor2= readLine()


    if (valor1 != null && valor2!=null){
        

        val nota1=valor1.toDouble()
        val nota2=valor2.toDouble()

        val resultado=(nota2-(nota2*0.85))+nota1
        val formatado = ("%.2f".format(resultado))
        println("TOTAL = R$ ${formatado}")
    }
}