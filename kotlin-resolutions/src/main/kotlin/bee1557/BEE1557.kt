package bee1557

fun main(args: Array<String>) {
    while (true) {
        val N = readLine()?.toIntOrNull() ?: break
        if (N == 0) break

        val matriz = Array(N) { IntArray(N) }
        var max = 1

        for (i in 0 until N) {
            for (j in 0 until N) {
                matriz[i][j] = max
                max *= 2
            }
            max = matriz[i][0] * 2
        }

        val larguraColuna = matriz[N - 1][N - 1].toString().length

        for (i in 0 until N) {
            for (j in 0 until N) {
                print(matriz[i][j].toString().padStart(larguraColuna, ' '))
                if (j < N - 1) print(" ")
            }
            println()
        }
        println()
    }
}