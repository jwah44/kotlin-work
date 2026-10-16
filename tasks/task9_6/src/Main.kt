// Task 9.6: application to compute dataset variance

import kotlin.system.exitProcess
import kotlin.io.path.Path

fun main(args: Array<String>) {
    // Implement main program here
    require(args.size == 1) {"supply a filename"}
    println(readData(args.joinToString()).size)
    println(variance(readData(args[0])))
}
