package bee1006

fun main(args: Array<String>) {
    val A = readLine()!!.toDouble()
    val B = readLine()!!.toDouble()
    val C = readLine()!!.toDouble()
    println("MEDIA = %.1f".format(A * 0.2 + B * 0.3 + C * 0.5))
}