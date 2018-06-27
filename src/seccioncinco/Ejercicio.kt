package seccioncinco

/*
1.- Crear un programa que muestre
los múltiplos de ocho hasta el valor 400

2.- Crear un programa que permita
cargar n números enteros y posteriormente
muestre en consola cuantos fueron pares
y cuantos impares.
 */

fun main(args: Array<String>) {
    for (i in 0..400){
        if(i % 8 == 0){
            println(i)
        }
    }

    for (i in 8..400 step 8){
        println(i)
    }

    println("*******Ejercicio 2********")
    println("Ingresa el total de números")
    val nums = readLine()!!.toInt()

    var pares = 0
    var impares = 0

    for (i in 1..nums){
        println("Ingresa un número")
        val j = readLine()!!.toInt()
        if(j%2==0) ++pares else ++impares
    }

    println("Numeros pares: $pares")
    println("Numeros impares: $impares")
}