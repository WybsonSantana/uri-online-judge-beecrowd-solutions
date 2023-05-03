package bee1759

fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    val mensagem = "Ho ".repeat(N).trim().plus("!")
    println(mensagem)
}