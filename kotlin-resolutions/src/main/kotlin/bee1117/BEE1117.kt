package bee1117

fun main(args: Array<String>) {
    var nota1 = 0.0
    var nota2 = 0.0
    do {
        nota1 = readLine()!!.toDouble()
if (nota1 < 0.0 || nota1 > 10.0) println("nota invalida")
    } while (nota1 < 0.0 || nota1 > 10.0)
    do {
        nota2 = readLine()!!.toDouble()
        if (nota2 < 0.0 || nota2 > 10.0) println("nota invalida")
    } while (nota2 < 0.0 || nota2 > 10.0)
    println("media = %.2f".format((nota1 + nota2) / 2))
}