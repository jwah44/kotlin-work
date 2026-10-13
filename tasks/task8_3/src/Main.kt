    // Task 8.3: weather station temperature analysis program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here
    val lowest = fetchData(args[0]).minBy { it.second }
    val highest = fetchData(args[0]).maxBy { it.second }
    println(lowest)
    println(highest)
}


