package bee1930

fun main(args: Array<String>) {
    val (T1, T2, T3, T4) = readLine()!!.split(" ").map { it.toInt() }
    println(T1 + T2 + T3 + T4 - 3)
}