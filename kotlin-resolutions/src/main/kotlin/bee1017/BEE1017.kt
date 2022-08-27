package bee1017

fun main(args: Array<String>) {
    val tempoGasto = readLine()!!.toInt()
    val velocidadeMedia = readLine()!!.toDouble()
    println("%.3f".format(tempoGasto * velocidadeMedia / 12.0))
}