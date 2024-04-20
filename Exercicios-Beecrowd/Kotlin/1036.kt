import java.util.*
import kotlin.math.pow

fun main(args: Array<String>) {


    val lista = readLine().toString().split(" ")
    val a=lista[0].toDouble()
    val b=lista[1].toDouble()
    val c=lista[2].toDouble()
    if (a<=0){
        println("Impossivel calcular")
    }
    else {

        val delta = b.pow(2) - 4 * (a * c)
        if (delta<0){
            println("Impossivel calcular")

        }
        else {
            val r1 = ((b * -1) + delta.pow(0.5)) / (2 * a)
            val r2 = ((b * -1) - delta.pow(0.5)) / (2 * a)
            println("R1 = ${"%.5f".format(r1)}")
            println("R2 = ${"%.5f".format(r2)}")
        }
    }

}