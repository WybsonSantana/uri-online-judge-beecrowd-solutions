package bee2717

fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    val (A, B) = readLine()!!.split(" ").map { it.toInt() }

    when {
        A + B <= N -> println("Farei hoje!")
        else -> println("Deixa para amanha!")
    }
}