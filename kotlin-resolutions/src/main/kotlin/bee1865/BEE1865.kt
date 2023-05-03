package bee1865

fun main(args: Array<String>) {
    val C = readLine()!!.toInt()
    repeat(C) {
        val (nome, N) = readLine()!!.split(" ").run { Pair(get(0), get(1).toInt()) }
        if (nome == "Thor") println("Y") else println("N")
    }
}