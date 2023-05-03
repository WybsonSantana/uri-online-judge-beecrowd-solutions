package bee1589

fun main(args: Array<String>) {
    val T = readLine()!!.toInt()

    repeat(T) {
        val (r1, r2) = readLine()!!.split(" ").map { it.toInt() }
        println(r1 + r2)
    }
}