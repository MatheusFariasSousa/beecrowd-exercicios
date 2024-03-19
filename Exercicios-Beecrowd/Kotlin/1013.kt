import java.util.*

fun main(args: Array<String>) {

    val valor = readLine().toString().split(" ")
    val a=valor[0].toInt()
    val b=valor[1].toInt()
    val c=valor[2].toInt()
    if (a>=b && a>=c){
        println("${a} eh o maior")
    }
    else if (b>=a && b>=c){
        println("${b} eh o maior")

    }
    else{
        println("${c} eh o maior")
    }

	
}