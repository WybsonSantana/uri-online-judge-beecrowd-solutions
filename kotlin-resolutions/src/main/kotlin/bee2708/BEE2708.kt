package bee2708

fun main(args: Array<String>) {
    var jipesNoParque = 0
    var turistasNoParque = 0

    while (true) {
        val input = readLine()!!.split(" ")

        val movimento = input[0]
        if (movimento == "ABEND") break
        val turistas = input[1].toInt()

        when (movimento) {
            "SALIDA" -> {
                jipesNoParque++
                turistasNoParque += turistas
            }
            else -> {
                jipesNoParque--
                turistasNoParque -= turistas
            }
        }
    }

    println(turistasNoParque)
    println(jipesNoParque)
}