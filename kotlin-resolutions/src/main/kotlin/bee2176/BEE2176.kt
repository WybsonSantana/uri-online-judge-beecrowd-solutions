package bee2176

fun main(args: Array<String>) {
    val S = readLine()!!
    val quantidadeBit1 = S.count { it == '1' }
    println(S + if (quantidadeBit1 % 2 == 0) "0" else "1")
}