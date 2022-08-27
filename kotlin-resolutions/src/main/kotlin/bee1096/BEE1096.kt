package bee1096

fun main(args: Array<String>) {
    var i = 1
    while (i <= 9) {
        for (j in 7 downTo 5) println("I=$i J=$j")
        i += 2
    }
}