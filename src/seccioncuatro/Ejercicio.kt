package seccioncuatro

/*
    Crear un programa que solicite ingresar dos números
    y dependiendo de si el primer número es MAYOR que
    el segundo mostrar en consola su suma y diferencia,
    de otro modo mostrará el producto y la división
    de dichos números dados por el usuario.
 */

fun main(args: Array<String>) {
    println("Ingrese el primer numero")
    val num1 = readLine()!!.toDouble()
    println("Ingrese el segundo numero")
    val num2 = readLine()!!.toDouble()

    if (num1 > num2) {
        println(num1 + num2)
        println(num1 - num2)
    } else {
        println(num1 * num2)
        println(num1 / num2)
    }

}