// Task 12.5.3: class with a custom setter

import kotlinx.datetime.LocalDate
import kotlinx.datetime.yearsUntil

class Person(_name: String, val birth: LocalDate) {
    var isMarried = false

    var name = _name
        set(value) {
            require(value.isNotBlank()) { "name must not be blank" }
            field = value
        }
        get() {
            return field.uppercase()
        }
}