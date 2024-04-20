import java.util.*

fun main(args: Array<String>) {
    var contador = readLine().toString().toInt()
    var texto=""
    while (contador!=0){
        texto=""
        contador--
        val numero= readLine().toString().toInt()
        if (numero%2==0){
            texto+="EVEN "

        }
        else{
            texto+="ODD "
        }
        if (numero>0){
            texto+="POSITIVE"
        }
        else{
            texto+="NEGATIVE"
        }
        if (numero==0){
            texto="NULL"
        }

        println(texto)

    }

	
}