import java.util.*

fun main(args: Array<String>) {
    var par = 0
    var imp=0
    var pos=0
    var neg=0

    for (x in 1..5) {
        val numero = readLine().toString().toInt()
        if (numero % 2 == 0) {
            par++
        }
        else{
            imp++

        }
        if (numero>0){
            pos++
        }
        else if (numero<0){
            neg++
        }
    }
    println("$par valor(es) par(es)")
    println("$imp valor(es) impar(es)")
    println("$pos valor(es) positivo(s)")
    println("$neg valor(es) negativo(s)")
	
}