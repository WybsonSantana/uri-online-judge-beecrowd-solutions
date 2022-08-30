package bee1172

fun main(args: Array<String>) {
    val X = IntArray(10)
    for (i in X.indices) {
        X[i] = readLine()!!.toInt()
        if (X[i] <= 0) X[i] = 1
    }
    for (indice in X.indices) {
        println("X[$indice] = ${X[indice]}")
    }
}