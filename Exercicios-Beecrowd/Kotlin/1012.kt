import java.util.*

fun main(args: Array<String>) {

    val valor = readLine().toString().split(" ")
    val a=valor[0].toDouble()
    val b=valor[1].toDouble()
    val c=valor[2].toDouble()
    val triangulo=(a*c)/2
    val circulo=(c*c)*3.14159
    val trapezio=(a+b)*c/2
    val quadrado=b*b
    val retangulo=a*b
    println("TRIANGULO: ${"%.3f".format(triangulo)}")
    println("CIRCULO: ${"%.3f".format(circulo)}")
    println("TRAPEZIO: ${"%.3f".format(trapezio)}")
    println("QUADRADO: ${"%.3f".format(quadrado)}")
    println("RETANGULO: ${"%.3f".format(retangulo)}")
	
}