package bee1097

fun main(args: Array<String>) {
    var i = 1
    var j = 7
    while (i <= 9) {
        for (n in 1..3) {
            println("I=$i J=$j")
            j -= 1
        }
        i += 2
        j = i + 6
    }
}