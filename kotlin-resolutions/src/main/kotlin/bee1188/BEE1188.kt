package bee1188

fun main(args: Array<String>) {
    var soma = 0.0
    var contador = 0
    val O = readLine()!!.toUpperCase().single()
    val M = Array(12) { DoubleArray(12) }
    for (i in 0..11) {
        for (j in 0..11) {
            M[i][j] = readLine()!!.toDouble()
        }
    }
    for (i in 6..11) {
        for (j in 11 - i + 1 until i) {
            soma += M[i][j]
            contador++
        }
    }
    if (O == 'M') soma /= contador
    println("%.1f".format(soma))
}