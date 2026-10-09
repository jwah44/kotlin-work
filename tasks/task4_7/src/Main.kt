// Task 4.7: finding the longest line in a file
import kotlin.io.path.*

fun main(args: Array<String>) {
    val passToPath = args.toList()
    var longestLineNumber = 0
    var lineLength = 0
    var counter = 0
    val filePath = Path(passToPath[0])

    filePath.forEachLine {
        counter += 1
        if (it.length > lineLength) {
            lineLength = it.length
            longestLineNumber = counter
        }
    }
    println("Line %5 is the longest with length %6".format(longestLineNumber, lineLength))
}