package seccionocho

interface Operacion{
    fun sum(num1: Int, num2: Int): Int
    fun div(num1: Int, num2: Int)
    fun mul(num1: Int, num2: Int): Int{
        return num1 * num2
    }
}

class Oper: Operacion{
    override fun div(num1: Int, num2: Int) {
        println("la división es: " + num1/num2)
    }

    override fun sum(num1: Int, num2: Int): Int {
        return num1 + num2 * 3
    }

}

fun main(args: Array<String>) {
    var operacion = Oper()
    var mioperacion = operacion.mul(5,7)
    println(mioperacion)
}