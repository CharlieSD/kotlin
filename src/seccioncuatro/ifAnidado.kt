package seccioncuatro

fun main(args: Array<String>) {

    print("Ingrese la medida en metros:")
    val medida : Double = readLine()!!.toDouble()

    if(medida >= 1.00){
        if (medida > 5.00){
            println("La medida $medida sobrepasa los límites aeeptados")
        } else {
            println("La medida $medida es aceptable")
        }
    } else {
        println("lo Siento, no es aceptable")
    }
}