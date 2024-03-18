import java.util.*

fun main(args: Array<String>) {
    val list= readLine().toString().split(" ")
    if (list != null) {
        val a = list[0].toInt()
        val b = list[1].toInt()
        val c = list[2].toInt()
        val d = list[3].toInt()





        if ((b > c) && (d > a) && (c + d > a + b) && (c > 0) && (d > 0) && (a % 2 == 0)) {
            println("Valores aceitos")

        } else {
            println("Valores nao aceitos")
        }

    }
    else{
        println("erro")
    }
}