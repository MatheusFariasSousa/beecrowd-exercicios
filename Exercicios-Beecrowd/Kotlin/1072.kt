import java.util.*

fun main(args: Array<String>) {
    var contador = readLine().toString().toInt()
    var dentro=0
    var fora =0
    while (contador!=0){
        val numero  = readLine().toString().toInt()
        if (numero>=10 && numero<=20){
            dentro++

        }
        else{
            fora++
        }
        contador--
    }
    println("$dentro in")
    println("$fora out")
}