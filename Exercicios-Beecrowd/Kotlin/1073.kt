import java.util.*

fun main(args: Array<String>) {

    val contador = readLine().toString().toInt()
    for (x in 1..contador){
        if (x%2==0){
            println("$x^2 = ${x*x}")
        }
    }
}