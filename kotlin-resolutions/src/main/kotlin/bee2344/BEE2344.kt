package bee2344

fun main(args: Array<String>) {
    val N = readLine()!!.toInt()

    val nota = when (N) {
        0 -> "E"
        in 1..35 -> "D"
        in 36..60 -> "C"
        in 61..85 -> "B"
        else -> "A"
    }

    println(nota)
}
