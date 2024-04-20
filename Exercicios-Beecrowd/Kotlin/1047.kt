import java.util.*

fun main(args: Array<String>) {
    val num = readLine().toString().split(" ")
    var hora_inicio = num[0].toInt()
    var minuto_inicial = num[1].toInt()
    var hora_final = num[2].toInt()
    var minuto_final = num[3].toInt()
    var result_hora = 0
    var result_min=0
    if (hora_inicio<hora_final){
        result_hora=(hora_final-hora_inicio)
    }
    else if (hora_inicio>hora_final) {
        result_hora = ((hora_inicio - 24) * -1) + hora_final
    }
    else {
        result_hora=24
    }


    if(minuto_inicial<minuto_final){
        result_min=minuto_final-minuto_inicial
    }
    else if (minuto_inicial>minuto_final){
        result_min=((minuto_inicial-60)*-1)+minuto_final
        result_hora--

    }
    if(result_hora==24 && result_min>0){
        result_hora=0
    }

    println("O JOGO DUROU ${result_hora} HORA(S) E ${result_min} MINUTO(S)")
}