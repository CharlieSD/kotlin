package seccionuno

fun main(args: Array<String>) {
    /*
        Crear un programa donde se pida introducir un número
         y muestre en consola el perímetro del mismo
         (el perímetro se calcula multiplicando el valor del lado por cuatro).
     */
    println("Programa que calcula el perimetro de un cuadrado")
    println("Ingrese el tamaño de un lado")
    val lado : Int = readLine()!!.toInt()
    val perimetro = lado * 4
    println("El perimetro del cuadrado es $perimetro")
}