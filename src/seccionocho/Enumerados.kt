package seccionocho

enum class Meses{
    ENE, FEB, MAR, ABR, MAY, JUN, JUL, AGO, SEP, OCT, NOV, DIC
}

fun main(args: Array<String>) {
    val sextoMes = Meses.JUN
    val primerMes = Meses.ENE

    println("Nombre: " + sextoMes.name)
    println("Nombre: " + primerMes.name)
    println("Posicion: " + sextoMes.ordinal)
    println("Posicion: " + primerMes.ordinal)
    println("Compara: " + sextoMes.compareTo(primerMes))
    println("Compara: " + primerMes.compareTo(sextoMes))

    for (items in Meses.values()){
        println(items)
    }

}