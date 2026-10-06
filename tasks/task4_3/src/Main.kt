// Task 4.3: grade calculation using a when expression
import kotlin.system.exitProcess
import kotlin.math.roundToInt

fun main (args: Array<String>) {
    if (args.size != 3) {
        println("Incorrect number of arguments")
        exitProcess(1)
    }
    val mark1= args[0].toFloat().roundToInt()
    val mark2= args[1].toFloat().roundToInt()
    val mark3= args[2].toFloat().roundToInt()

    val avgMark= (mark1 + mark2 + mark3) / 3

    val grade = when (avgMark) {
        in 0..39 -> "Fail"
        in 40..69 -> "Pass"
        in 70..100 -> "Distinction"
        else -> "Invalid mark"
    }

    println(grade)

}