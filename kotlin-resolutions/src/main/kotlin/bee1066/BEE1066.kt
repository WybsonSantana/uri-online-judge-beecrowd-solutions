package bee1066

fun main(args: Array<String>) {
    var contadorPar = 0
    var contadorImpar = 0
    var contadorPositivo = 0
    var contadorNegativo = 0
    for (i in 1..5) {
        val valor = readLine()!!.toInt()
        if (valor % 2 == 0) contadorPar++ else contadorImpar++
        if (valor > 0) contadorPositivo++
        if (valor < 0) contadorNegativo++
    }
    println(
        """
        $contadorPar valor(es) par(es)
        $contadorImpar valor(es) impar(es)
        $contadorPositivo valor(es) positivo(s)
        $contadorNegativo valor(es) negativo(s)
    """.trimIndent()
    )
}