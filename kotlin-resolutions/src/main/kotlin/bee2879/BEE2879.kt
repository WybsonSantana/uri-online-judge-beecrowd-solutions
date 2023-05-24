package bee2879

fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    var vitorias = 0

    repeat(N) {
        val portaComCarro = readLine()!!.toInt()
        if (portaComCarro != 1) vitorias++
    }

    println(vitorias)
}