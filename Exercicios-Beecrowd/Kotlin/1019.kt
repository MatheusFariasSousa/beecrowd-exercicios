import java.util.*
import java.util.Scanner
import kotlin.math.truncate


fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    val valor= scanner.nextInt()
    val horas=((valor/60)/60)
    val minutos0=valor%(24*3600)
    val minutos1=minutos0%3600
    val minutos3=minutos1/60
    val segundos=valor%60

    println("${"%.0f".format(truncate(horas.toDouble()))}:${"%.0f".format(truncate(minutos3.toDouble()))}:${"%.0f".format(truncate(segundos.toDouble()))}")



}

