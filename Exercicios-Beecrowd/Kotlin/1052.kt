import java.util.*

fun main(args: Array<String>) {

    val map = mapOf(1 to "January", 2 to "February", 3 to "March", 4 to "April", 5 to "May", 6 to "June", 7 to "July", 8 to "August",
    9 to "September", 10 to "October", 11 to "November", 12 to "December")
    val entrada= readLine().toString().toInt()
    println(map[entrada])
	
}