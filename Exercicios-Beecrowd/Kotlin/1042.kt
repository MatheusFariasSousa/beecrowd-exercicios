import java.util.*

fun main(args: Array<String>) {

    val num= readLine().toString().split(" ")
    var lista= arrayOf<Int>()
    for (x in num){
        lista += (x.toInt())

    }
    for (a in lista.sorted()){
        println(a)
    }
    println()
    for (b in lista){
        println(b)
    }
	
}