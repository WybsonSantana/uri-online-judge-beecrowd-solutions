package bee1150

fun main(args: Array<String>) {
    var contador = 0
    var soma = 0
    var X = readLine()!!.toInt()
    var Z = readLine()!!.toInt()
    while (Z <= X) {
        Z = readLine()!!.toInt()
    }
    while (soma <= Z) {
        soma += X
        X++
        contador++
    }
    println(contador)
}