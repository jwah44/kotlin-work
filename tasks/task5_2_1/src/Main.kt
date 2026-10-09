// Task 5.2.1: main program
fun main(args: Array<String>) {
    val radius = args.toList()
    println("%.4f".format(circleArea(radius[0].toDouble())))
    println("%.4f".format(circlePerimeter(radius[0].toDouble())))
}