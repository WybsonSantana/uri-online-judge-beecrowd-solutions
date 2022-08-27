package bee1115

fun main(args: Array<String>) {
    do {
        val (X, Y) = readLine()!!.split(" ").map(String::toInt)
        when {
            X > 0 && Y > 0 -> println("primeiro")
            X < 0 && Y > 0 -> println("segundo")
            X < 0 && Y < 0 -> println("terceiro")
            X > 0 && Y < 0 -> println("quarto")
        }
    } while (X != 0 && Y != 0)
}