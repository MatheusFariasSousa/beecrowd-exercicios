import java.util.*

fun main(args: Array<String>) {

  val scanner=Scanner(System.`in`)
        val a = scanner.next()
        val x=a.toDouble()



        println("NOTAS:")
        println("${(x/100).toInt()} nota(s) de R$ 100.00")
        println("${((x%100)/50).toInt()} nota(s) de R$ 50.00")
        println("${(((x%100)%50)/20).toInt()} nota(s) de R$ 20.00")
        println("${((((x%100)%50)%20)/10).toInt()} nota(s) de R$ 10.00")
        println("${(((((x%100)%50)%20)%10)/5).toInt()} nota(s) de R$ 5.00")
        println("${((((((x%100)%50)%20)%10)%5)/2).toInt()} nota(s) de R$ 2.00")
        println("MOEDAS:")
        println("${(((((((x%100)%50)%20)%10)%5)%2)).toInt()} moeda(s) de R$ 1.00")
        println("${((((((((x%100)%50)%20)%10)%5)%2)%1)/0.5).toInt()} moeda(s) de R$ 0.50")
        println("${(((((((((x%100)%50)%20)%10)%5)%2)%1)%0.5)/0.25).toInt()} moeda(s) de R$ 0.25")
        println("${((((((((((x%100)%50)%20)%10)%5)%2)%1)%0.5)%0.25)/0.10).toInt()} moeda(s) de R$ 0.10")
        println("${(((((((((((x%100)%50)%20)%10)%5)%2)%1)%0.5)%0.25)%0.10)/0.05).toInt()} moeda(s) de R$ 0.05")
        println("${"%.0f".format((((((((((((x%100)%50)%20)%10)%5)%2)%1)%0.5)%0.25)%0.10)%0.05)/0.01)} moeda(s) de R$ 0.01")



	
}