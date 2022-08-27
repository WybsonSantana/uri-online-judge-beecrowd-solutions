package bee1014

fun main(args: Array<String>) {
    val X = readLine()!!.toInt()
    val Y = readLine()!!.toDouble()
    println("%.3f km/l".format(X / Y))
}