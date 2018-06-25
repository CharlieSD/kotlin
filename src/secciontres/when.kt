package secciontres

fun main(args: Array<String>) {

    val x = 18

    when(x) {
        1 -> println("El valor es 1")
        2 -> println("El valor es 2")
        3 -> println("El valor es 3")
        in 5..15 -> println("El valor esta entre 5 y 15")
        !in 5..15 -> println("El valor no esta entre 5 y 15")
        else -> println("El valor está fuera de rango")
    }

    val promedio = 10

    val resultado = when(promedio) {
        10 -> "Excelente, Felicidades!! tu calificación es $promedio"
        9 -> "Tu resultado es bueno, tu calificación es $promedio"
        in 6..8 -> "Tu resultado es suficiente, tu calificación es $promedio"
        else -> "Tu resultado es insuficiente, tu calificación es $promedio"
    }

    println(resultado)

}