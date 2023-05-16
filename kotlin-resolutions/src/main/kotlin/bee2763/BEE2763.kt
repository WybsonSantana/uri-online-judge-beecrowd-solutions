package bee2763

fun main(args: Array<String>) {
    val cpf = readLine()!!
    println(cpf.slice(0..2))
    println(cpf.slice(4..6))
    println(cpf.slice(8..10))
    println(cpf.slice(12..13))
}