package seccioncinco

fun main(args: Array<String>) {
    for (i in 1..5){
        if(i == 3) {
            continue
        }
        println(i)
    }
    for (i in 1..2){
        for (j in 1..5){
            println("contador1: $i")
            if(j == 2){
                break;
            }
        }
    }
}