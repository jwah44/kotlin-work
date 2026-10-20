// Task 12.5.4: demo program for class with a computed property
import kotlinx.datetime.LocalDate

fun main() {
    val date = LocalDate(1987, 8, 12)
    val person = Person("Frank", date)
    println(person.age)
}