package bee2747

fun main(args: Array<String>) {
    for (i in 1..7) {
        for (j in 1..39) {
            when {
                i == 1 || i == 7 -> print("-")
                j == 1 || j == 39 -> print("|")
                else -> print(" ")
            }
        }
        println()
    }
}