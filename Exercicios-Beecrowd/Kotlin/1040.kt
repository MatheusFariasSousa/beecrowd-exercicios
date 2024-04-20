import java.util.*
import kotlin.math.floor

fun main(args: Array<String>) {

    val entrada= readLine().toString().split(" ")
    val n1=entrada[0].toDouble()
    val n2=entrada[1].toDouble()
    val n3=entrada[2].toDouble()
    val n4=entrada[3].toDouble()
    val mediaa= ((n1*2)+(n2*3)+(n3*4)+n4)/10
    val media=floor(mediaa*10)/10
    println("Media: ${"%.1f".format(media).replace(",",".")}")
    if ((media)>=7){
        println("Aluno aprovado.")
    }
    else if(media<5){
        println("Aluno reprovado.")

    }
    else{
        println("Aluno em exame.")
        val n5= readLine().toString().toDouble()
        println("Nota do exame: ${n5.toString().replace(",",".")}")
        if (((n5+media)/2)>=5){
            println("Aluno aprovado.")
        }
        else{
            println("Aluno reprovado.")
        }
        println("Media final: ${"%.1f".format((n5+media)/2).replace(",",".")}")
    }
	
}