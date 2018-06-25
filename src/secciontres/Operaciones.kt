package secciondos

fun main(args: Array<String>) {

    println("Ingresa el primer número")
    val num1 : Int = readLine()!!.toInt()

    println("Ingresa el segundo número")
    val num2 : Int = readLine()!!.toInt()

    val suma = num1 + num2
    val resta = num1 - num2
    val mult = num1 * num2
    val div = num1 / num2

    println("La suma es $suma")
    println("La resta es $resta")
    println("La multiplicación es $mult")
    println("La división es $div")

}