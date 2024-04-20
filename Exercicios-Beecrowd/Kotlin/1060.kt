import java.util.*

fun main(args: Array<String>) {

    var quantidade = 0
for (x in 1..6){
    val num= readLine().toString().toDouble()
    if (num>0){
        quantidade++
        }
    }
    println("$quantidade valores positivos")
	
}