// Task 12.5.2: demo program for class with custom getter
import kotlinx.datetime.LocalDate

fun main() {
    val birth = LocalDate(1984, 7, 4)
    val person = Person("Frank", birth)

    println(person.name)
}