package seccionseis

/*
Crear un programa que pida introducir
cuatro elementos numéricos en dos arrays.
Posteriormente obtener la suma de ambos arrays
y el resultado obtenido almacenarlo
en un tercer array del mismo tamaño.
La suma es valor por valor
 */

fun main(args: Array<String>) {

    println("por favor inserte 4 numeros para el array 1: ")
    val arrayUno = Array<Int>(4){0}
    for (i in 0..3){
        arrayUno[i] = readLine()!!.toInt()
    }
    println("por favor inserte 4 numeros para el array 2: ")
    val arrayDos = Array<Int>(4){0}
    for (i in 0..3){
        arrayDos[i] = readLine()!!.toInt()
    }
    val Suma = Array<Int>(4){0}

    for (i in 0..3){
        Suma[i] = arrayUno[i]+ arrayDos[i]
        println(Suma[i])
    }

}