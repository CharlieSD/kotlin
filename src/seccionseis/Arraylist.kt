package seccionseis

fun main(args: Array<String>) {
    val arralist = ArrayList<String>()

    arralist.add("Uva")
    arralist.add("Kiwi")
    arralist.add("Mango")

    println("El elemento en la posición tres es: " + arralist[2])

    print("Todos los elementos son: ")
    for (i in arralist){
        println(i)
    }

    print("Todos los elementos por indice son: ")
    for (i in 0..2){
        println(arralist[i])
    }

    arralist[1] = ("Fresa")
    arralist.set(0, "Sandia")

    println(arralist)

    if(arralist.contains("Sandia")){
        println("se encontro")
    }else{
        println("No se encontro")
    }

    for (i in 0..arralist.size-1){
        println(arralist[i])
    }
}