package seccionseis

fun main(args: Array<String>) {

    val hashMap = HashMap<Int, String>()

    hashMap.put(1, "Puebla")
    hashMap.put(200, "Tlaxcala")
    hashMap.put(0, "Guadalajara")
    hashMap.put(50, "Monterrey")

    println(hashMap[200])

    hashMap.put(50, "Charlie Espinoza")

    for (k in hashMap.keys){
        println(hashMap[k])
    }

}