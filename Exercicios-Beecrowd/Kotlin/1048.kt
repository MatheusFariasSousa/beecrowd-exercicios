import java.util.*

fun main(args: Array<String>) {

    val salario= readLine().toString().toDouble()

    var porcentagem=0.0
    val dicionario= mapOf(400.00 to 0.15,400.01 to 0.12,800.01 to 0.10,1200.01 to 0.07,2000.01 to 0.04)
    for ((x,v) in dicionario){
        if (x<=salario){
            porcentagem=v

        }
        else{
            break
        }

    }
    println("Novo salario: ${"%.2f".format(((salario*porcentagem)+salario)).replace(",",".")}")
    println("Reajuste ganho: ${"%.2f".format(salario*porcentagem).replace(",",".")}")
    println("Em percentual: ${(porcentagem*100).toInt()} %")
    
	
}