package seccioncuatro

fun main(args: Array<String>) {
    println("Que calificación obtuvo en variables?")
    val caliVariables : Int = readLine()!!.toInt()

    println("Que calificación obtuvo en operacionesMatemáticas?")
    val caliOperacionesMatematicas : Int = readLine()!!.toInt()

    println("Que calificación obtuvo en operadoresLógicos?")
    val caliOperadorLogico : Int = readLine()!!.toInt()

    println("Que calificación obtuvo en condiciones?")
    val caliCondiciones : Int = readLine()!!.toInt()

    val promedio = (caliVariables + caliOperacionesMatematicas + caliOperadorLogico + caliCondiciones) / 4

    if(promedio == 10){
        println("Excelente, Felicidades!! tu calificación es $promedio")
    } else if (promedio >= 9) {
        println("Tu resultado es bueno, tu calificación es $promedio")
    } else if (promedio in 6..8) {
        println("Tu resultado es suficiente, tu calificación es $promedio")
    } else {
        println("Tu resultado es insuficiente, tu calificación es $promedio")
    }
}