package bee1144

fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    for (i in 1..N)
        println("$i ${i * i} ${i * i * i}\n$i ${i * i + 1} ${i * i * i + 1}")
}