// Task 4.7: finding the longest line in a file
fun main(args: Array<String>) {
    val filePath = args
    var longestLineNumber = 0
    var lineLength = 0
    var counter = 0

    filePath.forEachLine {
        counter += 1
        if (it.size > lineLength) {
            lineLength = it.size
            longestLineNumber = counter
        }
    }
    println("Line %5 is the longest with length %6".format(longestLineNumber, lineLength))
}