package bee2754

fun main(args: Array<String>) {
    val num1 = 234.345
    val num2 = 45.698

    println("%.6f - %.6f".format(num1, num2))
    println("%.0f - %.0f".format(num1, num2))
    println("%.1f - %.1f".format(num1, num2))
    println("%.2f - %.2f".format(num1.times(100).toInt().toDouble().div(100), num2))
    println("%.3f - %.3f".format(num1, num2))
    println("%e - %e".format(num1, num2))
    println("%E - %E".format(num1, num2))
    println("%.6g - %.5g".format(num1, num2))
    println("%.6g - %.5g".format(num1, num2))
}