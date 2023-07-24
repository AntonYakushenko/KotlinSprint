package lesson_2

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val travelTime = 457

    val arrivalHour = (departureHour + (departureMinute + travelTime) / 60) % 24
    val arrivalMinute = (departureMinute + travelTime) % 60

    println("Arrival time: $arrivalHour:$arrivalMinute")
}
