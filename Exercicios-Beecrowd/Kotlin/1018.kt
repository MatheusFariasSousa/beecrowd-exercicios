import java.util.*

fun main(args: Array<String>) {

    val scanner=Scanner(System.`in`)
    val x = scanner.nextInt()
    println(x)
    println("${x/100} nota(s) de R$ 100,00")
    println("${(x%100)/50} nota(s) de R$ 50,00")
    println("${((x%100)%50)/20} nota(s) de R$ 20,00")
    println("${(((x%100)%50)%20)/10} nota(s) de R$ 10,00")
    println("${((((x%100)%50)%20)%10)/5} nota(s) de R$ 5,00")
    println("${(((((x%100)%50)%20)%10)%5)/2} nota(s) de R$ 2,00")
    println("${((((((x%100)%50)%20)%10)%5)%2)} nota(s) de R$ 1,00")
}