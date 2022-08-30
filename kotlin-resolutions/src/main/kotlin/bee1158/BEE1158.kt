package bee1158

fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    for (i in 1..N) {
        var contador = 0
        var soma = 0
        var (X, Y) = readLine()!!.split(" ").map(String::toInt)
        while (contador < Y) {
            if (X % 2 != 0) {
                soma += X
                X++
                contador++
            } else {
                X++
            }
        }
        println(soma)
    }
}