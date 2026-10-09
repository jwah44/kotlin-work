import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        rollDie()
    } else {
            val dieSides = args.toList()
            rollDie(dieSides[0].toInt())
        }
}