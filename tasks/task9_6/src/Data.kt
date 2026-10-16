// Task 9.6: readData() function
import kotlin.io.path.Path
import kotlin.io.path.forEachLine
import kotlin.io.path.exists

fun readData(filename: String) = buildList {
    require(Path(filename).exists()) {"this file does not exist"}
    Path(filename).forEachLine {
        add(it.toDouble())
    }
}