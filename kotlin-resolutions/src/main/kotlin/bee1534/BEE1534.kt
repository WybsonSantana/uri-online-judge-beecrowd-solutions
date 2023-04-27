package bee1534

fun main(args: Array<String>) {
    while (true) {
        val N = readLine()?.toIntOrNull() ?: break
        for (i in 0 until N) {
            for (j in 0 until N) {
                val x = when {
                    N % 2 == 1 && i == N / 2 && j == N / 2 || i + j == N - 1 -> 2
                    i == j -> 1
                    else -> 3
                }
                print(x)
            }
            println()
        }
    }
}