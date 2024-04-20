import java.util.*

fun main(args: Array<String>) {

    val primeiro= readLine().toString().toInt()
    val segundo= readLine().toString().toInt()
    var contador=0
    if (segundo>primeiro){
        for (a in primeiro+1..segundo-1){
            if (a%2 !=0){
                contador+=a
            }

        }
    }
    else {
        for (a in segundo + 1..primeiro - 1) {
            if (a % 2 != 0) {
                contador += a
            }

        }

    }
    println(contador)
}