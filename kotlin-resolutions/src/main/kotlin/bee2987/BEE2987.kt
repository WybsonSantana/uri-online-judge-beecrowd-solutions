package bee2987

fun main(args: Array<String>) {
    val L = readLine()!!.get(0)

    val alfabeto = ('A'..'Z').toList()
    println(alfabeto.indexOf(L).plus(1))
}