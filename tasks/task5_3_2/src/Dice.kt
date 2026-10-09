// Task 5.3.2: rollDice() function
import kotlin.random.Random

fun rollDice(numSides: Int = 6, numDie: Int = 1) {
    for (i in 1..numDie) {
        if (numSides in setOf(4, 6, 8, 10, 12, 20)) {
            println("Rolling a d$numSides...")
            val result = Random.nextInt(1, numSides + 1)
            println("You rolled $result")
        }
        else {
            println("Error: cannot have a $numSides-sided die")
        }
    }
}