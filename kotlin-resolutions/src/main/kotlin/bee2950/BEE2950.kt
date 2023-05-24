package bee2950

fun main(args: Array<String>) {
    val (N, X, Y) = readLine()!!.split(" ").map { it.toDouble() }
    println("%.2f".format(N / (X + Y)))
}