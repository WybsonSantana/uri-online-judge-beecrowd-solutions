package bee1079

fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    for (i in 1..N) {
        val (valor1, valor2, valor3) = readLine()!!.split(" ").map(String::toDouble)
        println("%.1f".format(valor1 * 0.2 + valor2 * 0.3 + valor3 * 0.5))
    }
}