package bee2862

fun main(args: Array<String>) {
    val C = readLine()!!.toInt()

    repeat(C) {
        val N = readLine()!!.toInt()

        when {
            N > 8000 -> println("Mais de 8000!")
            else -> println("Inseto!")
        }
    }
}