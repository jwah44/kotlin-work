// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

import kotlin.math.sqrt
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size < 3) {
        println("Error: values for a, b, c required on command line")
        exitProcess(1)
    }
    val semiPerimeter = (args[0].toDouble() + args[1].toDouble() + args[2].toDouble() )/2
    var Area = sqrt((semiPerimeter*(
            (semiPerimeter - args[0].toDouble()) * (semiPerimeter - args[1].toDouble()) * (semiPerimeter - args[2].toDouble()))))
    println("Area = %.2f".format(Area))
}