package bee2159

import kotlin.math.ln

fun main(args: Array<String>) {
    val n = readLine()!!.toDouble()

    val P = n / ln(n)
    val M = 1.25506 * (n / ln(n))

    println("%.1f %.1f".format(P, M))
}