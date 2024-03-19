import java.util.*

fun main(args: Array<String>) {

	val peca1= readLine().toString().split(" ")
    val peca2= readLine().toString().split(" ")
    val valor1=peca1[1].toInt()
    val valor2=peca1[2].toDouble()
    val valor3=peca2[1].toInt()
    val valor4=peca2[2].toDouble()
    val resultado= (valor1*valor2)+(valor3*valor4)
    val formatado= ("%.2f".format(resultado))
    println("VALOR A PAGAR: R$ ${formatado}")
	
}