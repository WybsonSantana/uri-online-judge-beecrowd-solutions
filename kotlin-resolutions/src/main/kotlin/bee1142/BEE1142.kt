package bee1142

fun main(args: Array<String>) {
    var contador = 1
    val N = readLine()!!.toInt()
    for (i in 1..N) {
        repeat(3) {
            print("$contador ")
            contador++
        }
        println("PUM")
        contador++
    }
}