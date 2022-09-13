package bee1190

fun main(args: Array<String>) {
    var range: IntProgression
    var soma = 0.0
    var contador = 0
    val O = readLine()!!.toUpperCase().single()
    val M = Array(12) { DoubleArray(12) }
    for (i in 0..11) {
        for (j in 0..11) {
            M[i][j] = readLine()!!.toDouble()
        }
    }
    for (i in 1..10) {
        if (i <= 5) range = 11 - i + 1..11 else range = i + 1..11
        for (j in range) {
            soma += M[i][j]
            contador++
        }
    }
    if (O == 'M') soma /= contador
    println("%.1f".format(soma))
}