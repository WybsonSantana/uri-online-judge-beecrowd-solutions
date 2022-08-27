package bee1072

fun main(args: Array<String>) {
    var valoresIn = 0
    var valoresOut = 0
    val N = readLine()!!.toInt()
    for (i in 1..N) {
        val valor = readLine()!!.toInt()
        if (valor in 10..20) valoresIn++ else valoresOut++
    }
    println("$valoresIn in\n$valoresOut out")
}