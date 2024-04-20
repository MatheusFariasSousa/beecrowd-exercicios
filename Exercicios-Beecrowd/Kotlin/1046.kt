import java.util.*

fun main(args: Array<String>) {

	    val num= readLine().toString().split(" ")
    var hora_inicio=num[0].toInt()
    var hora_final=num[1].toInt()
    var contador=0
    if (hora_final>hora_inicio) {
        while (hora_final > hora_inicio) {
            contador++
            hora_inicio++
        }
        println("O JOGO DUROU $contador HORA(S)")
    }
    else if (hora_inicio>hora_final){
        while (hora_inicio!=hora_final){
            hora_inicio++
            contador++
            if (hora_inicio==24){
                hora_inicio=0

            }
        }
        println("O JOGO DUROU $contador HORA(S)")
    }
    else{
        println("O JOGO DUROU 24 HORA(S)")
    }
	
}