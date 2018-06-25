package seccioncinco

fun main(args: Array<String>) {
    for (i in 0..5){
        println("Contador es: $i")
        for (j in 0..3){
            println("Contador2 es: $j")
        }
        println("For anidado concluido")
    }
    println("El ciclo principal ha terminado")
}