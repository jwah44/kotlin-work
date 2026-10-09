// Task 5.3.2: main program
import kotlin.system.exitProcess

fun main(args: Array<String>) {

    if (args.size != 1) {
        println("supply one argument")
        exitProcess(1)
    } else {
        val argString = args.contentToString().trim('[', ']')
        val argSplit = argString.split("d")

        val sides = argSplit[0].toInt()
        val numTimes = argSplit[1].toInt()

        rollDice(sides, numTimes)
    }

}