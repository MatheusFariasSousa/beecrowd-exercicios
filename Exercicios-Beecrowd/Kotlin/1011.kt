import java.util.*

fun main(args: Array<String>) {

	val valor = readLine().toString()
    val teste=valor.toDouble()
    val resultado=(4.0/3)*3.14159*(teste*teste*teste)
    val formatado=("%.3f".format(resultado))
    println("VOLUME = ${formatado}")
}