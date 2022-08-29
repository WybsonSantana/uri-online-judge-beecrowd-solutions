package bee1153

fun main(args: Array<String>) {
    var fatorial = 1
    val N = readLine()!!.toInt()
    for (i in N downTo 1) fatorial *= i
    println(fatorial)
}