package bee2168

fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    val cameras = Array(N + 1) { IntArray(N + 1) }
    val quadras = Array(N) { CharArray(N) { 'U' } }

    for (i in 0..N) {
        cameras[i] = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    }

    for (i in 0 until N) {
        for (j in 0 until N) {
            var esquinas = 0

            if (cameras[i][j] == 1) esquinas++
            if (cameras[i][j + 1] == 1) esquinas++
            if (cameras[i + 1][j] == 1) esquinas++
            if (cameras[i + 1][j + 1] == 1) esquinas++
            if (esquinas >= 2) quadras[i][j] = 'S'
        }
    }

    for (i in 0 until N) {
        println(quadras[i].joinToString(""))
    }
}