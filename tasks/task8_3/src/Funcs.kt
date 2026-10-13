// Task 8.3: functions for temperature analysis

import kotlin.io.path.Path
import kotlin.io.path.forEachLine

typealias Record = Pair<String,Double>

fun fetchData(filename: String):List<Record> = buildList {
    // Finish the implementation of this function
    val recordList= mutableListOf<Record>()
    val fileNameData = Path(filename)
    fileNameData.forEachLine {
        val splitList = it.split(",")
        val Record = Pair(splitList[0], splitList[1].toDouble())
        recordList.add(Record)
    }
    return recordList
}

// Challenge: compute average temperature with one line of code
// in main(), instead of using the function below!

fun averageTemp(data: List<Record>): Double {
    var sum = 0.0
    for (record in data) {
        sum += record.second
    }
    return sum / data.size
}
