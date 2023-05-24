package bee2936

fun main(args: Array<String>) {
    val qtdPorcaoKurupira = readLine()!!.toInt()
    val qtdPorcaoBoiTata = readLine()!!.toInt()
    val qtdPorcaoBoto = readLine()!!.toInt()
    val qtdPorcaoMapinguari = readLine()!!.toInt()
    val qtdPorcaoIara = readLine()!!.toInt()

    val quantidadeMandioca = 225 +
            qtdPorcaoKurupira * 300 + qtdPorcaoBoiTata * 1500 + qtdPorcaoBoto * 600 + qtdPorcaoMapinguari * 1000 + qtdPorcaoIara * 150

    println(quantidadeMandioca)
}