package secciondos

fun main(args: Array<String>) {
    println("********Primer Ejercicio********")
    println("Programa que calcula el total a pagar de un producto")
    println("Cuantos productos se compra?")
    val numProducoto = readLine()!!.toInt()
    println("Cuanto cuesta el producto")
    val costoProducto = readLine()!!.toInt()

    val pago = numProducoto * costoProducto

    println("Total a pagar: $pago")
    println()

    println("********Segundo Ejercicio********")
    println("Programa que realiza operaciones cno 4 números")
    println("Ingrese el primer número")
    val num1 = readLine()!!.toInt()
    println("Ingrese el segundo número")
    val num2 = readLine()!!.toInt()
    println("Ingrese el tercero número")
    val num3 = readLine()!!.toInt()
    println("Ingrese el cuarto número")
    val num4 = readLine()!!.toInt()

    val suma = num1 + num2
    val producto = num3 * num4

    println("La suma es $suma")
    println("El producto es $producto")
}