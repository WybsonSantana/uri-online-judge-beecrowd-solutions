package bee2234

fun main(args: Array<String>) {
    val (H, P) = readLine()!!.split(" ").map { it.toDouble() }
    println("%.2f".format(H / P))
}