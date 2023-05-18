package bee2779

fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    val M = readLine()!!.toInt()
    val figurinhasCompradas = mutableSetOf<Int>()

    for (i in 1..M)
        figurinhasCompradas.add(readLine()!!.toInt())

    println(N - figurinhasCompradas.size)
}