package bee2787

fun main(args: Array<String>) {
    val L = readLine()!!.toInt()
    val C = readLine()!!.toInt()

    when {
        L % 2 == 0 && C % 2 == 0 || L % 2 == 1 && C % 2 == 1 -> println(1)
        else -> println(0)
    }
}