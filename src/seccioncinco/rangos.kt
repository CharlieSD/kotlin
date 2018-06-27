package seccioncinco

fun main(args: Array<String>) {
    val nums = 1..50
    for (i in nums){
        println(i)
    }

    for (i in nums step 2){
        println(i)
    }

    for (i in nums.reversed()){
        println(i)
    }

    val num2 = 15 downTo 1
    for (i in num2 ){
        println(i)
    }

    for (i in 1 until 16){
        println(i)
    }

    val chars = 'A'..'z'
    for (i in chars){
        println(i)
    }
}