package bee1099

fun main(args: Array<String>) {
    var soma = 0
    val N = readLine()!!.toInt()
    for (i in 1..N) {
        val (X, Y) = readLine()!!.split(" ").map(String::toInt)
        if (Y > X) {
            for (j in X + 1 until Y) if (j % 2 != 0) soma += j
        } else {
            for (j in Y + 1 until X) if (j % 2 != 0) soma += j
        }
        println(soma)
        soma = 0
    }
}