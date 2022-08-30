package bee1157

fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    for (i in 1..N) if (N % i == 0) println(i)
}