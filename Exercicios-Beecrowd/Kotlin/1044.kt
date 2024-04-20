import java.util.*

fun main(args: Array<String>) {
    val num= readLine().toString().split(" ")
    val a=num[0].toInt()
    val b=num[1].toInt()
    if (a%b==0 || b%a==0){
        println("Sao Multiplos")

    }
   else{
       println("Nao sao Multiplos")
    }
	
}