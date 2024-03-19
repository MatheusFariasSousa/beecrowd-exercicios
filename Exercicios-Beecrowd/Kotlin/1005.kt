import java.util.*

fun main(args: Array<String>) {

	val valor1= readLine()
    val valor2= readLine()
    if (valor1 != null && valor2!=null){
        val nota1=valor1.toDouble()
        val nota2=valor2.toDouble()
        val resultado= ((nota1*3.5)+(nota2*7.5))/11
        val formatado = ("%.5f".format(resultado))
        println("MEDIA = $formatado")
    }
	
}