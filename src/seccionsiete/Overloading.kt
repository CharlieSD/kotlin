package seccionsiete

fun sum(num1: Int, num2: Int): Int{
    val suma = num1 + num2
    return suma
}

fun sum(num1: Int, num2: Int, num3: Int): Int{
    val suma = num1 + num2 + num3
    return suma
}

fun sum(num1: Int, num2: Int, num3: Int, num4: Int): Int{
    val suma = num1 + num2 + num3
    return suma
}

fun main(args: Array<String>) {

    var resultado = sum(1,5)
    println(resultado)
    resultado = sum(4,2,5)
    println(resultado)
    resultado = sum(2,7,8,1)
    println(resultado)

}