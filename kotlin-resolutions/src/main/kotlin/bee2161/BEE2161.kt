package bee2161

fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    var x = 0.0

    for (i in 0 until N) {
        x = 1.0 / (x + 6.0)
    }

    x += 3.0

    println("%.10f".format(x))
}