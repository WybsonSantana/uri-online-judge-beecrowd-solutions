package bee2748

fun main(args: Array<String>) {
    for (i in 1..7) {
        for (j in 1..39) {
            when {
                i == 1 || i == 7 -> print("-")
                j == 1 || j == 39 -> print("|")
                i == 2 && j in 10..16 -> print("Roberto"[j - 10])
                i == 4 && j in 10..13 -> print("5786"[j - 10])
                i == 6 && j in 10..15 -> print("UNIFEI"[j - 10])
                else -> print(" ")
            }
        }
        println()
    }
}