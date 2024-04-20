import java.util.*

fun main(args: Array<String>) {

    val  entrada= readLine().toString().split(" ")
    val codigo=entrada[0].toInt()
    val lanche=entrada[1].toInt()
    val map = mutableMapOf(1 to 4,2 to 4.5,3 to 5,4 to 2,5 to 1.5 )
    println("Total: R$ ${"%.2f".format(map[codigo].toString().toDouble()*lanche).replace(",",".")}")
	
}