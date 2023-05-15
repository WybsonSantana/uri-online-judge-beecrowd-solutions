package bee2752

fun main(args: Array<String>) {
    var frase: String
    frase = "AMO FAZER EXERCICIO NO URI"

    println("<%s>".format(frase))
    println("<%30s>".format(frase))
    println("<%.20s>".format(frase))
    println("<%-20s>".format(frase))
    println("<%-30s>".format(frase))
    println("<%.30s>".format(frase))
    println("<%30.20s>".format(frase))
    println("<%-30.20s>".format(frase))
}