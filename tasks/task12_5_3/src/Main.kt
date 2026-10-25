// Task 12.5.3: demo program for class with custom setter
import kotlinx.datetime.LocalDate


fun main() {
    val birth = LocalDate(1997, 8, 23)
    val person = Person("Mr. Frank", birth)

    person.name = ""
}