package bee1132

fun main(args: Array<String>) {
    var soma = 0
    val X = readLine()!!.toInt()
    val Y = readLine()!!.toInt()
    if (X < Y) {
        for (numero in X..Y)
            if (numero % 13 != 0) soma += numero
    } else {
        for (numero in Y..X)
            if (numero % 13 != 0) soma += numero
    }
    println(soma)
}