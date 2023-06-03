package bee3040

fun main(args: Array<String>) {
    val N = readLine()!!.toInt()

    repeat(N) {
        val (h, d, g) = readLine()!!.split(" ").map { it.toInt() }

        when {
            h in (200..300) && d >= 50 && g >= 150 -> println("Sim")
            else -> println("Nao")
        }
    }
}