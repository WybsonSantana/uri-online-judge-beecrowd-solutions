package bee2235

import kotlin.math.max

fun main(args: Array<String>) {
    val (A, B, C) = readLine()!!.split(" ").map { it.toInt() }

    val doisNumerosIguais = A == B || A == C || B == C
    val maiorNumero = maxOf(A, B, C)
    val somaOutrosDois = A + B + C - maiorNumero

    if (doisNumerosIguais || maiorNumero == somaOutrosDois) println("S") else println("N")
}