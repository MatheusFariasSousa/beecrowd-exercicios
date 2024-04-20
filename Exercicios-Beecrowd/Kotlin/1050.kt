import java.util.*

fun main(args: Array<String>) {

    val entrada= readLine().toString().toInt()
    val dicionario= mapOf(61 to "Brasilia",71 to "Salvador", 11 to "Sao Paulo",21 to "Rio de Janeiro",32 to "Juiz de Fora",19 to "Campinas",27 to "Vitoria", 31 to "Belo Horizonte")
    if (entrada in dicionario.keys){
        println(dicionario[entrada])

    }
    else{
        println("DDD nao cadastrado")
    }

	
}