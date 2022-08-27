package bee1116

fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    for (i in 1..N) {
        val (X, Y) = readLine()!!.split(" ").map(String::toInt)
        when (Y) {
            0 -> println("divisao impossivel")
            else -> println("%.1f".format(X.toDouble() / Y.toDouble()))
        }
    }
}