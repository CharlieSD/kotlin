package seccionsiete

fun polimorfismo(num1: Int):Unit{
    println("El número es: $num1")

}

fun polimorfismo(num1: Double): Unit{
    println("El número es: $num1")

}

fun polimorfismo(num1: Float):Unit{
    println("El número es: $num1")

}

fun polimorfismo(nombre: String):Unit{
    println("El nombre es: $nombre")

}
fun main(args: Array<String>) {
    polimorfismo(4)
    polimorfismo(16.786)
    polimorfismo(43.67f)
    polimorfismo("Charlie")

}