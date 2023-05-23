package bee2786

fun main(args: Array<String>) {
    val L = readLine()!!.toInt()
    val C = readLine()!!.toInt()

    val qtdLajotas1 = L * C + (L - 1) * (C - 1)
    val qtdLajotas2 = ((L - 1) * 2) + ((C - 1) * 2)

    println(qtdLajotas1)
    println(qtdLajotas2)
}