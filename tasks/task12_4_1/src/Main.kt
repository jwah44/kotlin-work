// Task 12.4.1: main program
fun main() {
    val circlreal = Circle(Point(5.0, 7.5), 6.0)
    println(circlreal.area())
    println(circlreal.perimeter())
    println(circlreal.contains(Point(6.0, 7.0)))
}