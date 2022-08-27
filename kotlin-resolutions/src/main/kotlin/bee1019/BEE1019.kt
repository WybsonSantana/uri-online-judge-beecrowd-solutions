package bee1019

fun main(args: Array<String>) {
    val tempo = readLine()!!.toInt()
    println("%d:%d:%d".format(tempo.div(3600), tempo.mod(3600).div(60), tempo.mod(3600).mod(60)))
}