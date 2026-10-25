// Task 12.8.1: demo program for Day enum class

fun main() {
    println("Provide a day:")
    val dayGiven = readln()
    val day = Day.valueOf(dayGiven)
    println(day)
}