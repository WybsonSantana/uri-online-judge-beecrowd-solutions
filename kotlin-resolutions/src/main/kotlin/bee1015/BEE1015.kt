package bee1015

import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {
    val (x1, y1) = readLine()!!.split(" ").map(String::toDouble)
    val (x2, y2) = readLine()!!.split(" ").map(String::toDouble)
    println("%.4f".format(sqrt((x2 - x1).pow(2.0) + (y2 - y1).pow(2.0))))
}