package bee1038

fun main(args: Array<String>) {
    val (codigo, quantidade) = readLine()!!.split(" ").map(String::toInt)
    when (codigo) {
        1 -> println("Total: R$ %.2f".format(4.00 * quantidade))
        2 -> println("Total: R$ %.2f".format(4.50 * quantidade))
        3 -> println("Total: R$ %.2f".format(5.00 * quantidade))
        4 -> println("Total: R$ %.2f".format(2.00 * quantidade))
        5 -> println("Total: R$ %.2f".format(1.50 * quantidade))
    }
}