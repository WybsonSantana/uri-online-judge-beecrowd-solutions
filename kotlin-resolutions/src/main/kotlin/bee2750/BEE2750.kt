package bee2750

fun main(args: Array<String>) {
    val vars = IntArray(16) { it }

    for (i in 1..20) {
        for (j in 1..39) {
            when {
                i == 1 || i == 20 || i == 3 -> print("-")
                j == 1 || j == 13 || j == 23 || j == 39 -> print("|")
                i == 2 -> when {
                    j == 4 -> print("decimal")
                    j == 16 -> print("octal")
                    j == 26 -> print("Hexadecimal")
                    j < 4 || j > 36 || j in 11..17 || j in 22..25 -> print(" ")
                }

                else -> when {
                    j == 8 -> print(vars[i - 4].toString())
                    j == 18 -> print(vars[i - 4].toString(8))
                    j == 31 -> print(vars[i - 4].toString(16).toUpperCase())
                    !(i > 11 && j == 14) && !(i > 13 && j == 2) -> print(" ")
                }
            }
        }
        println()
    }
}