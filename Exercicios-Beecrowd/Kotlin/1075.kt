import java.util.*

fun main(args: Array<String>) {

    val contador= readLine().toString().toInt()
    for (x in 0..10001){
        if (x%contador==2){
            println(x)
        }
    }
}