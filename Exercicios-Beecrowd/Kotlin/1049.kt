import java.util.*

fun main(args: Array<String>) {

	    val tipo = readLine().toString()
    val classe = readLine().toString()
    val familia = readLine().toString()
    if (tipo == "vertebrado") {
        if (classe == "ave") {
            if (familia == "carnivoro") {
                println("aguia")
            } else {
                println("pomba")
            }
        } else {
            if (familia == "onivoro") {
                println("homem")
            } else {
                println("vaca")
            }

        }

    } else {
        if (classe == "inseto") {
            if (familia == "hematofago") {
                println("pulga")
            } else {
                println("lagarta")
            }


        }
        else{
            if (familia=="hematofago"){
                    println("sanguessuga")
                }
                else{
                    println("minhoca")

                }
            }
        }
	
}