package seccionseis

fun main(args: Array<String>) {
    val nums = mutableListOf(0, 1, 2, -12, -24) // ya es mutable

    nums[2] = 4

    for (i in nums){
        println(i)
    }

    val inmutable = setOf(1, 2, 4, 0, 50, 50, 4) // inmutable sin repetir
    for (i in inmutable){
        println(i)
    }

    val mutable = mutableSetOf(51, 2, 3, 23)
    mutable.add(40)
    for (i in mutable){
        println(i)
    }
}