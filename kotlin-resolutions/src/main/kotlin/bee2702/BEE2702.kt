package bee2702

fun main(args: Array<String>) {
    val (Ca, Ba, Pa) = readLine()!!.split(" ").map { it.toInt() }
    val (Cr, Br, Pr) = readLine()!!.split(" ").map { it.toInt() }

    var soma = 0

    if (Cr > Ca) soma += Cr - Ca
    if (Br > Ba) soma += Br - Ba
    if (Pr > Pa) soma += Pr - Pa

    println(soma)
}