import java.util.*

fun main(args: Array<String>) {
  val valor1= readLine()
    val valor2= readLine()
    val valor3= readLine()
    val valor4= readLine()
    if (valor1 != null && valor2!=null && valor3!= null && valor4!= null){

        val nota1=valor1.toInt()
        val nota2=valor2.toInt()
        val nota3=valor3.toInt()
        val nota4=valor4.toInt()
        val formatado = (nota1*nota2-nota3*nota4)
        println("DIFERENCA = $formatado")
    }
	
}