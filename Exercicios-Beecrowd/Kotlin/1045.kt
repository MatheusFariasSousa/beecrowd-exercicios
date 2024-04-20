import java.util.*
import kotlin.math.pow

fun main(args: Array<String>) {

    val num= readLine().toString().split(" ")
    var lista= arrayOf<Double>()
    for (x in num){
        lista+=x.toDouble()
    }
    lista.sort()
    val A=lista[2]
    val B=lista[1]
    val C=lista[0]






    if (A >= B+C){
       println("NAO FORMA TRIANGULO")
   }
    else if(A.pow(2) == (B.pow(2) + C.pow(2))){
        println("TRIANGULO RETANGULO")

    }
    else if (A.pow(2) > ((B.pow(2) + C.pow(2)))){
        println("TRIANGULO OBTUSANGULO")
   }
    else if (A.pow(2) < ((B.pow(2) + C.pow(2)))){
        println("TRIANGULO ACUTANGULO")

   }
    if (A==B && B==C){
        println("TRIANGULO EQUILATERO")
    }
    else if(A==B || B==C || C==A) {
        println("TRIANGULO ISOSCELES")

    }
	
}