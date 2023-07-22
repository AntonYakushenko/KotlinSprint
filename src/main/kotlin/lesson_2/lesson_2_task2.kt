package lesson_2

fun main() {
    val permanentEmployees = 50
    val internEmployees = 30
    val permanentSalary = 30000
    val internSalary = 20000

    val permanentExpenses = permanentEmployees * permanentSalary
    val totalExpenses = permanentExpenses + (internEmployees * internSalary)
    val averageSalary = totalExpenses / (permanentEmployees + internEmployees)

    println(permanentExpenses)
    println(totalExpenses)
    println(averageSalary)
}

