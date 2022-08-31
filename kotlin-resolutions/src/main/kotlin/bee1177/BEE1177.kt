package bee1177

fun main(args: Array<String>) {
    var contador = 0
    val N = IntArray(1000)
    val T = readLine()!!.toInt()
    while (contador < N.size) {
        for (i in 0 until T) {
            N[contador] = i
            contador++
            if (contador == N.size) break
        }
    }
    for (indice in N.indices) {
        println("N[$indice] = ${N[indice]}")
    }
}