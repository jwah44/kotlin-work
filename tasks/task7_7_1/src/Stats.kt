// Task 7.7.1: statistics functions

fun median(list: List<Float>): Float {
    if (list.size % 2 != 0) {
        return list[(list.size-1) / 2]
    } else {
        return (list[list.size / 2] + list[(list.size / 2) - 1]) / 2
    }

}

fun statsOutput(list: List<Float>) {
    println("Median: ${median(list)}")
    println("Maximum: ${list.max()}")
    println("Minimum: ${list.min()}")
    val listlength = list.size
    println("Mean: ${list.sum() / listlength}")
}