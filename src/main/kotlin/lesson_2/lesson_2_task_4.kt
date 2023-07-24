package lesson_2

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val buff = 0.2

    val crystalBonus = (crystalOre * buff).toInt()
    val ironBonus = (ironOre * buff).toInt()

    println("Bonus materials:")
    println("Crystal: $crystalBonus")
    println("Iron: $ironBonus")
}
