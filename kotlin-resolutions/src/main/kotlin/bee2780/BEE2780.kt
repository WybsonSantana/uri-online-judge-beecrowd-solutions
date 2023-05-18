package bee2780

fun main(args: Array<String>) {
    val D = readLine()!!.toInt()

    when {
        D <= 800 -> println(1)
        D <= 1400 -> println(2)
        else -> println(3)
    }
}