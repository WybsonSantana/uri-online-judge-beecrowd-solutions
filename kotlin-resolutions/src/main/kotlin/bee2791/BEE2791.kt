package bee2791

fun main(args: Array<String>) {
    val posicoesFeijao = readLine()!!.split(" ").map { it.toInt() }
    println(posicoesFeijao.indexOf(1).plus(1))
}