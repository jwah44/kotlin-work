// Task 12.4.1: Circle class
import kotlin.math.PI

class Circle(val centre: Point, val radius: Double) {
    init {
        require(radius > 0) {"radius must be greater than zero!"}
    }

    fun area() = PI*radius*radius
    fun perimeter() = PI*(radius*2)

    fun contains(p: Point): Boolean {
        if (p.distanceTo(centre) <= radius) {
            return true
        } else {
            return false
        }
    }
}