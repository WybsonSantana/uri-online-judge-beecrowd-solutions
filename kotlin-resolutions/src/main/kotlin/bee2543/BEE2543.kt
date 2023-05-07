package bee2543

fun main(args: Array<String>) {
    while (true) {
        val input = readLine()?.split(" ")?.map { it.toIntOrNull() }
        if (input == null || input.size != 2) break

        val (N, I) = input

        val contagemCounterStrike = (1..N!!).count {
            val (i, j) = readLine()!!.split(" ").map { it.toInt() }
            i == I && j == 0
        }

        println(contagemCounterStrike)
    }
}
