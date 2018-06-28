package seccionsiete

fun main(args: Array<String>) {
    val res = sumar(3 ,9)
    println(res)
    val res2 = summar(3, 9)
    println(res2)
    val max = maxx(150, 190)
    println(max)
}

fun maxx(a: Int, b: Int): Int = if(a > b) a else b

fun summar(a: Int, b: Int): Int = a + b

fun sumar(a: Int, b: Int): Int {
    return a + b
}

