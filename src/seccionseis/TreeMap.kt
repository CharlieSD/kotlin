package seccionseis

import java.util.*

fun main(args: Array<String>) {
    val nums = listOf(1,2,3,4,5,6)

    for (i in nums){
        println(i)
    }

    for((i, elem) in nums.withIndex()){
        println("$i : $elem")
    }

    val map = TreeMap<String, Int>()
    map["Charlie"] = 25
    map["Sol"] = 25

    for ((nombre, edad) in map){
        println("$nombre : $edad")
    }
}