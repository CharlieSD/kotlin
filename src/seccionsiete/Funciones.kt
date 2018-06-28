package seccionsiete

fun suma(num1: Int, num2: Int): Int{
    val suma = num1 + num2
    return suma
}

fun sinParametros():Unit{
    println("Esta funcion no cuenta con parametros")
}

fun main(args: Array<String>) {
    var result = suma(13,27)
    println(result)
    sinParametros()
}