package bee2061

fun main(args: Array<String>) {
    var (N, M) = readLine()!!.split(" ").map { it.toInt() }

    repeat(M) {
        when (readLine()) {
            "fechou" -> N++
            "clicou" -> N--
        }
    }

    println(N)
}