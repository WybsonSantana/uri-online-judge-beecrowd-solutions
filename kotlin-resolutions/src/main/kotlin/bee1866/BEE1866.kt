package bee1866

fun main(args: Array<String>) {
    val C = readLine()!!.toInt()

    repeat(C) {
        var soma = 0
        val N = readLine()!!.toInt()

        for (i in 1..N) {
            if (i % 2 != 0) soma++ else soma--
        }
        println(soma)
    }
}