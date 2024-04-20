import java.util.*

fun main(args: Array<String>) {

    var pos = 0

    for (x in 1..5) {
        val numero = readLine().toString().toInt()
        if (numero % 2 == 0) {
            pos++
        }

    }
    println("$pos valores pares")
}