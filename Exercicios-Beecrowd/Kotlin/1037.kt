import java.util.*

fun main(args: Array<String>) {
    val scanner=Scanner(System.`in`)
    val  entrada=scanner.next().toString().toDouble()
    if(entrada>=0 && entrada<=25){
        println("Intervalo [0,25]")


    }
    else if (entrada>25 && entrada<=50){
        println("Intervalo (25,50]")
    }
    else if (entrada > 50 && entrada <=75){
        println("Intervalo (50,75]")
    }
    else if (entrada > 75 && entrada <=100){
        println("Intervalo (75,100]")

    }
    else{
        println("Fora de intervalo")
    }
	
}