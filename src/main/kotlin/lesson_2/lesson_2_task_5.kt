package lesson_2

import kotlin.math.pow


fun main() {
    val summa = 70000.0
    val percent = 16.7 / 100
    val years = 20

    val result = summa * (1 + percent).pow(years)
    val roundedResult = String.format("%.3f", result)

    println(roundedResult)
}




