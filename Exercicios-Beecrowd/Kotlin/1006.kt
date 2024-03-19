import java.util.*

fun main(args: Array<String>) {

    val valor1= readLine()
    val valor2= readLine()
    val valor3= readLine()
    if (valor1 != null && valor2!=null && valor3!= null){
        val nota1=valor1.toDouble()
        val nota2=valor2.toDouble()
        val nota3=valor3.toDouble()
        val resultado= ((nota1*2)+(nota2*3)+(nota3*5))/10
        val formatado = ("%.1f".format(resultado))
        println("MEDIA = $formatado")
    }
	
}