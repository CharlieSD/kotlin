package seccionocho

open class Humano(){
    fun saludo(){
        println("Hola a todos")
    }
}

class Perro() : Humano() {
    fun ladrido(){
        println("Guaauu, Guaauu")
    }
}

fun main(args: Array<String>) {
    val persona = Humano()
    val perrito = Perro()

    val Charlie = persona.saludo()
    val coco = perrito.saludo()
}