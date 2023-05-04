package bee2029

import kotlin.math.pow

fun main(args: Array<String>) {
    while (true) {
        val V = readLine()?.toDoubleOrNull() ?: break
        val D = readLine()?.toDoubleOrNull() ?: break

        val PI = 3.14
        val raio = D / 2
        val area = PI * raio.pow(2)
        val altura = V / area

        println("ALTURA = %.2f".format(altura))
        println("AREA = %.2f".format(area))
    }
}