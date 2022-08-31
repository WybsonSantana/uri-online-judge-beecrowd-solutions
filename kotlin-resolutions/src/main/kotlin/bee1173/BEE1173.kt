package bee1173

fun main(args: Array<String>) {
    val N = IntArray(10)
    N[0] = readLine()!!.toInt()
    for (i in 1 until N.size) {
        N[i] = N[i - 1] * 2
    }
    for (indice in N.indices) {
        println("N[$indice] = ${N[indice]}")
    }
}