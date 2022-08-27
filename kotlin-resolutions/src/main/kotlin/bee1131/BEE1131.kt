package bee1131

fun main(args: Array<String>) {
    var vitoriasInter = 0
    var vitoriasGremio = 0
    var empates = 0

    do {
        val (golsInter, golsGremio) = readLine()!!.split(" ").map(String::toInt)
        when {
            golsInter > golsGremio -> vitoriasInter++
            golsGremio > golsInter -> vitoriasGremio++
            else -> empates++
        }
        println("Novo grenal (1-sim 2-nao)")
        val novoGrenal = readLine()!!.toInt()
    } while (novoGrenal != 2)

    val venceuMais = when {
        vitoriasInter > vitoriasGremio -> "Inter"
        vitoriasGremio > vitoriasInter -> "Gremio"
        else -> "Nao houve vencedor"
    }

    println(
        """
        ${vitoriasInter + vitoriasGremio + empates} grenais
        Inter:$vitoriasInter
        Gremio:$vitoriasGremio
        Empates:$empates
        $venceuMais venceu mais
    """.trimIndent()
    )
}