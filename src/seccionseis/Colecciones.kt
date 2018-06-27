package seccionseis

fun main(args: Array<String>) {
    val hashMap = hashMapOf(1 to "Charlie", 2 to "Edith")
    hashMap.put(50, "Sol")
    println(hashMap[50])

    val letras = arrayOf("a", "b", "c") // mutable
    println(letras[1])

    val nums = listOf(0, 1, 2, -12, -24) // inmutable
    for (i in nums){
        println(i)
    }
}