package bee2753

fun main(args: Array<String>) {
    val numeros = IntArray(26) { it + 97 }
    numeros.forEach {
        println("$it e ${it.toChar()}")
    }
}