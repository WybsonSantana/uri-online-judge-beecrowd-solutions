package bee1113

fun main(args: Array<String>) {
    do {
        val (X, Y) = readLine()!!.split(" ").map(String::toInt)
        when {
            Y > X -> println("Crescente")
            X > Y -> println("Decrescente")
        }
    } while (X != Y)
}