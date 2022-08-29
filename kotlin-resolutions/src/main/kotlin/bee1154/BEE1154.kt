package bee1154

fun main(args: Array<String>) {
    var idade = 0
    var somaIdades = 0.0
    var contador = 0
    do {
        idade = readLine()!!.toInt()
        if (idade < 0) break
        somaIdades += idade
        contador++
    } while (idade > 0)
    println("%.2f".format(somaIdades / contador))
}