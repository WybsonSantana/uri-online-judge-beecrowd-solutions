package bee1134

fun main(args: Array<String>) {
    var contadorAlcool = 0
    var contadorGasolina = 0
    var contadorDiesel = 0
    do {
        val opcao = readLine()!!.toInt()
        when (opcao) {
            1 -> contadorAlcool++
            2 -> contadorGasolina++
            3 -> contadorDiesel++
        }
    } while (opcao != 4)

    println("MUITO OBRIGADO\nAlcool: $contadorAlcool\nGasolina: $contadorGasolina\nDiesel: $contadorDiesel")
}