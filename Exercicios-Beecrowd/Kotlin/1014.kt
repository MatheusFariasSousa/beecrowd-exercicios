import java.util.*

fun main(args: Array<String>) {
    val a = readLine().toString()
    val b= readLine().toString()
    val valor=a.toInt()
    val gas=b.toDouble()

    val media=valor/gas
    println("${"%.3f".format(media)} km/l")
	
}