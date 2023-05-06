package bee2172

fun main(args: Array<String>) {
    while (true) {
        val (X, N) = readLine()!!.split(" ").map { it.toInt() }
        if (X == 0 && N == 0) break

        println(X * N)
    }
}