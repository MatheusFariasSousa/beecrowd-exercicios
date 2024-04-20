import java.util.*

fun main(args: Array<String>) {
    var x= readLine().toString().toInt()
    var contador=0

    while (contador!=6){
        if (x%2 !=0){
            contador++
            println(x)
        }
        x++

    }
}