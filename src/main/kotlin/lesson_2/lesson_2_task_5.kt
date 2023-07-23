package lesson_2


fun main() {
    val summa = 70000.0
    val percent = 16.7 / 100
    val years = 20

    var result = summa
    for (i in 1..years) {
        result *= (1 + percent)
    }

    val roundedResult = String.format("%.3f", result)
    println(roundedResult)
}



