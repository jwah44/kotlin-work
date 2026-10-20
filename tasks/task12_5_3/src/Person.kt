// Task 12.5.3: class with a custom setter

import kotlinx.datetime.LocalDate
import kotlinx.datetime.yearsUntil

class Person(var name: String, val birth: LocalDate) {
    var isMarried = false
    val age get() = birth.yearsUntil(today())
}
