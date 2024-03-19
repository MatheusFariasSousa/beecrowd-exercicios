import java.util.*
import kotlin.math.*

fun main(args: Array<String>) {

    val a = readLine().toString().split(" ")
    val b= readLine().toString().split(" ")
    val x1=a[0].toDouble()
    val x2=a[1].toDouble()
    val x3=b[0].toDouble()
    val x4=b[1].toDouble()
    val resultado=(((x3-x1).pow(2))+((x4-x2).pow(2))).pow(0.5)
    println("%.4f".format(resultado))
	
}