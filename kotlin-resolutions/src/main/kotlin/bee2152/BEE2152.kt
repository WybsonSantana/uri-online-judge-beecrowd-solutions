package bee2152

fun main(args: Array<String>) {
    val N = readLine()!!.toInt()

    repeat(N) {
        val (H, M, O) = readLine()!!.split(" ").map { it.toInt() }

        val hora = H.toString().padStart(2, '0')
        val minuto = M.toString().padStart(2, '0')

        val mensagem = if (O == 0) "A porta fechou!" else "A porta abriu!"
        println("$hora:$minuto - $mensagem")
    }
}