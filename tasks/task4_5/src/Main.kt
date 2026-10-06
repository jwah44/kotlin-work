// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here
    if (args.size!=1) {
        println("Supply one argument")
        exitProcess(1)
    }
    var sum = 0
    for (n in 1..args[0].toInt() step 2) {
        sum += n
    }
    println(sum)
}
