package seccionseis

fun main(args: Array<String>) {
    val arrayUno = Array(5){0}

    arrayUno[1] = 5
    arrayUno[2] = 50
    arrayUno[3] = -159
    arrayUno[4] = 100

    println("Array en la posición 3 es: ${arrayUno[3]}")

    for (i in arrayUno){
        println(i)
    }

    for (i in 0..4){
        println(arrayUno[i])
    }

    val fruta = Array(2){""}

    for (i in 0..1){
        print("Ingrese la fruta del indice [$i] ")
        fruta[i] = readLine()!!
    }

    for (i in 0..1){
        println("La fruta en el indice [$i] es: ${fruta[i]}")
    }
}