package bee1114

fun main(args: Array<String>) {
    do {
        val senha = readLine()!!.toInt()
        when (senha) {
            2002 -> println("Acesso Permitido")
            else -> println("Senha Invalida")
        }
    } while (senha != 2002)
}