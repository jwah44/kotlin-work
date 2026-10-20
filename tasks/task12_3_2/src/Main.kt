// Task 12.3.2: demo of Person class with secondary constructor
import kotlinx.datetime.LocalDate

fun main() {
    //val date = LocalDate(1997, 8, 23)
    //val person1 = Person("Mr. Giraffe", date)
    val person1 = Person("Mr. Fish", "1997-08-23")
    println(person1.name)
    println(person1.birth)
    println(person1.isMarried)
}