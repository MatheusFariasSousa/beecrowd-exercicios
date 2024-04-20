import java.util.*

fun main(args: Array<String>) {
    val num= readLine().toString().split(" ")
    val x=num[0].toDouble()
    val y=num[1].toDouble()
    if (x>0 && y>0){
        println("Q1")
    }
    else if (x<0 && y<0){
        println("Q3")
    }
    else if (x>0 && y<0){
        println("Q4")

    }
    else if(x<0 && y>0){
        println("Q2")
    }
    else if (x==0.0 && y==0.0){
        println("Origem")

    }
    else{
        if (x==0.0){
            println("Eixo Y")

        }
        else{
            println("Eixo X")
        }
    }
}