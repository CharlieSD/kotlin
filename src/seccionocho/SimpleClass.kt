package seccionocho

class Persona(nombre: String, edad: Int,
              altura: Double, peso: Double,
              colorOjos: String, genero: String){


    var nombre: String? = null
    var edad: Int? = null
    var altura: Double? = null
    var peso: Double? = null
    var colorOjos: String? = null
    var genero: String? = null

    init {
        this.nombre = nombre
        this.edad = edad
        this.altura = altura
        this.peso = peso
        this.colorOjos = colorOjos
        this.genero = genero
    }

}

fun main(args: Array<String>) {

    var person = Persona("Edith del Sol", 25, 1.60, 55.0, "Hermosos", "Mujer")

    println("El nombre es: " + person.nombre)
}