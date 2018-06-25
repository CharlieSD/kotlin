package seccionuno

fun main(args: Array<String>) {

    println("Cuál es tu nombre? ")
    val nombre = readLine()
    println(nombre)

    println("Cual es tu edad?")
    val edad : Int =  readLine()!!.toInt()
    println(edad)
}