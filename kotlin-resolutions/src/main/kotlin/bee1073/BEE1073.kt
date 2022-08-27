package bee1073

fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    for (numero in 1..N)
        if (numero % 2 == 0) println("$numero^2 = ${numero * numero}")
}