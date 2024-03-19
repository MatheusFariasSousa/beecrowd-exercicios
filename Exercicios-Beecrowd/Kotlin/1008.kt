import java.util.*

fun main(args: Array<String>) {
val valor1= readLine()
    val valor2= readLine()
    val valor3= readLine()

    if (valor1 != null && valor2!=null && valor3!= null){

        val nota1=valor1.toInt()
        val nota2=valor2.toInt()
        val nota3=valor3.toDouble()
        val resultado=nota2*nota3
        val formatado = ("%.2f".format(resultado))
        println("NUMBER = $nota1")
        println("SALARY = U$ ${formatado}")
    }

	
}