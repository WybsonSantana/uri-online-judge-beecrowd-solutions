package bee1065

fun main(args: Array<String>) {
    var contador = 0
    for (i in 1..5) {
        val valor = readLine()!!.toInt()
        if (valor % 2 == 0) contador++
    }
    println("$contador valores pares")
}