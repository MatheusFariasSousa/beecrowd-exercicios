import java.util.*

fun main(args: Array<String>) {

    val num= readLine().toString().split(" ")
    val a=num[0].toDouble()
    val b=num[1].toDouble()
    val c=num[2].toDouble()
    if (a+b>c && a+c>b && c+b>a){
        println("Perimetro = ${"%.1f".format(a+b+c).replace(",",".")}")
    }
    else{
        println("Area = ${"%.1f".format(((a+b)*c/2)).replace(",",".")}")
    }
	
}