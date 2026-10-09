// Task 5.1.2: main program
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("supply one argument")
        exitProcess(1)
    }
    val dieSides = args.toList()
    rollDie(dieSides[0].toInt())
}