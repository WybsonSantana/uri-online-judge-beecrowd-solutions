package bee2896

fun main(args: Array<String>) {
    val T = readLine()!!.toInt()

    repeat(T) {
        val (N, K) = readLine()!!.split(" ").map { it.toInt() }
        println(N.div(K) + N.mod(K))
    }
}