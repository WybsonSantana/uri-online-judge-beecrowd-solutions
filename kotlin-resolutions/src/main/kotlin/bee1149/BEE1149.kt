package bee1149

fun main(args: Array<String>) {
    var soma = 0
    val valores = readLine()!!.split(" ").map(String::toInt)
    val A = valores[0]
    var N = 0
    for (valor in 1..valores.size) {
        if (valores[valor] > 0) {
            N = valores[valor]
            break
        }
    }
    for (i in 0 until N) {
        soma += A + i
    }
    println(soma)
}