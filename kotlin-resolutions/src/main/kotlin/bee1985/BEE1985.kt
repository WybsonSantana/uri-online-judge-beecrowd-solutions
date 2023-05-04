package bee1985

fun main(args: Array<String>) {
    val cardapio = mapOf(1001 to 1.5, 1002 to 2.5, 1003 to 3.5, 1004 to 4.5, 1005 to 5.5)
    var total = 0.0

    val p = readLine()!!.toInt()

    repeat(p) {
        val (produto, q) = readLine()!!.split(" ").map { it.toInt() }
        total += cardapio[produto]!! * q
    }
    println("%.2f".format(total))
}