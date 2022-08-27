package bee1060

fun main(args: Array<String>) {
    var contador = 0
    for (i in 1..6) {
        val valor = readLine()!!.toDouble()
        if (valor > 0) contador++
    }
    println("$contador valores positivos")
}