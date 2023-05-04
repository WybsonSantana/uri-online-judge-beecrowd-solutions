package bee2060

fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    val L = IntArray(N)
    
    readLine()!!.split(" ").forEachIndexed { index, numero ->
        L[index] = numero.toInt()
    }

    val quantidadeMultiplosDe2 = L.count { it % 2 == 0 }
    val quantidadeMultiplosDe3 = L.count { it % 3 == 0 }
    val quantidadeMultiplosDe4 = L.count { it % 4 == 0 }
    val quantidadeMultiplosDe5 = L.count { it % 5 == 0 }

    println("$quantidadeMultiplosDe2 Multiplo(s) de 2")
    println("$quantidadeMultiplosDe3 Multiplo(s) de 3")
    println("$quantidadeMultiplosDe4 Multiplo(s) de 4")
    println("$quantidadeMultiplosDe5 Multiplo(s) de 5")
}