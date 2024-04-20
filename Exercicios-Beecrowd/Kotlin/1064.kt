import java.util.*

fun main(args: Array<String>) {

    var pos=0
    var med=0.0
for (x in 1..6){
    val numero= readLine().toString().toDouble()
    if (numero>=0){
        pos++
        med+=numero
    }


}
    println("$pos valores positivos")
    println("${"%.1f".format(med/pos).replace(",",".")}")
	
}