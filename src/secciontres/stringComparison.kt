package secciontres

fun main(args: Array<String>) {
    val nombre : String = "Charlie"
    val nombre2 : String = "charlie"

    if(nombre.equals(nombre2))
        println("Son Iguales")
    else
        println("No son iguales")

    if(nombre == nombre2)
        println("Son Iguales")
    else
        println("No son iguales")
}