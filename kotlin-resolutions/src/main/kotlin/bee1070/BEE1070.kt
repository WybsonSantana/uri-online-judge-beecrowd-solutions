package bee1070

fun main(args: Array<String>) {
    var contador = 0
    var valor = readLine()!!.toInt()
    while (contador < 6) if (valor % 2 != 0) {
            println(valor)
            valor += 2
            contador++
        } else {
            valor += 1
        }
}