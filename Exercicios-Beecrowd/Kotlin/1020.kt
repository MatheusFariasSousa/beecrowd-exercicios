import java.util.*
import java.util.Scanner

fun main(args: Array<String>) {

    val scanner=Scanner(System.`in`)
    val dias=scanner.nextInt()
    val ano=dias/365
    val mes=(dias%365)/30
    val dia=(dias%365)%30
    println("$ano ano(s)")
    println("$mes mes(es)")
    println("$dia dia(s)")
	
}