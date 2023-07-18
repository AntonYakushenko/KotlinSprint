package lesson_1

fun main() {
    val totalSeconds: Int = 6480

    val hours: Int = totalSeconds / 3600
    val minutes: Int = (totalSeconds % 3600) / 60
    val seconds: Int = totalSeconds % 60

    println("${String.format("%02d", hours)}:${String.format("%02d", minutes)}:${String.format("%02d", seconds)}")
}