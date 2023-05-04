package bee1933

import kotlin.math.max

fun main(args: Array<String>) {
    val (A, B) = readLine()!!.split(" ").map { it.toInt() }
    if (A != B) println(max(A, B)) else println(A)
}