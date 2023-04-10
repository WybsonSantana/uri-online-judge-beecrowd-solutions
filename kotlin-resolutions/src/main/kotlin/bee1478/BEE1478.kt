package bee1478

fun main(args: Array<String>) {
    var valor: Int
    var N: Int
    do {
        N = readLine()!!.toInt()
        if (N == 0) break
        for (i in 1..N) {
            valor = i
            for (j in 1..N) {
                if (i == j) valor = 1
                print("%3d".format(valor))
                if (j < N) print(" ") else println()
                if (j >= i) valor++ else valor--
            }
        }
        println()
    } while (true)
}