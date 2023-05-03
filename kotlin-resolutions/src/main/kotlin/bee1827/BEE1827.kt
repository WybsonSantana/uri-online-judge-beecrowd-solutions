package bee1827

fun main(args: Array<String>) {
    while (true) {
        val N = readLine()?.toIntOrNull() ?: break
        for (i in 0 until N) {
            for (j in 0 until N) {
                val x = when {
                    i == N / 2 && j == N / 2 -> 4
                i >= N / 3 && j >= N / 3 && i < N - N / 3 && j < N - N / 3 -> 1
                    i == j -> 2
                    i + j == N - 1 -> 3
                    else -> 0
                }
                print(x)
            }
            println()
        }
        println()
    }
}