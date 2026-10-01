// Task 3.5: simple file I/O

import kotlin.io.path.Path
import kotlin.io.path.appendText
import kotlin.io.path.readText
import kotlin.io.path.writeText

fun main() {
    // Add your code here
    val fileName = Path("test.txt")
    fileName.writeText("test text\n")
    fileName.appendText("here is some extra text")
    val fileContents = fileName.readText()
    println(fileContents)
}
