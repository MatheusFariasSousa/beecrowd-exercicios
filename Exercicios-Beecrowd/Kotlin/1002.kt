import java.util.*

fun main(args: Array<String>) {

val nu1 = readLine()

    if (nu1 != null) {
        val number = nu1.toDouble()
        val resultado = 3.14159 * (number * number)
        val final = "%.4f".format(resultado)
        println("A=$final")
    } else {
        println("Invalid input")
    }
}