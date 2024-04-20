import java.util.*

fun main(args: Array<String>) {

    val salario= readLine().toString().toDouble()
    var cota=0.0
    if (salario<=2000.00){
        println("Isento")

    }
    else if(salario>2000.00 && salario<3000.00){
        cota=(salario-2000.00)*0.08
        println("R$ ${"%.2f".format(cota).replace(",",".")}")
    }
    else if (salario>3000.00 && salario<4500.00){
        val pass1=salario-3000.00
        cota=(pass1*0.18)+((salario-pass1-2000.00)*0.08)
        println("R$ ${"%.2f".format(cota).replace(",",".")}")

    }
    else{
        val valor1=salario-4500.00
        val soma1=valor1*0.28
        val novo_salario=salario-valor1-3000.00
        val soma2=novo_salario*0.18
        val novo_salario1= salario-valor1-novo_salario-2000.00
        val soma3=novo_salario1*0.08
        cota=soma1+soma2+soma3
        println("R$ ${"%.2f".format(cota).replace(",",".")}")
    }

}