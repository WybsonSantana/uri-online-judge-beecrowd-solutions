package bee2006

fun main(args: Array<String>) {
    val T = readLine()!!.toInt()
    val (A, B, C, D, E) = readLine()!!.split(" ").map { it.toInt() }
    val acertos = listOf(A, B, C, D, E).count { it == T }.let(::println)
}