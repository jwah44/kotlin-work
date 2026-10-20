// Task 7.7.1: statistics functions
import java.Math.floorDiv

fun median(list: List): Double {
    if (list.size() % 2 != 0) {
        return list[(list.size()-1) / 2]
    } else {
        return (list[list.size() / 2] + list[(list.size() / 2) - 1]) / 2
    }

}

fun statsOutput(list: List) {
    println(median(list))
    println(list.max())
    println(list.min())
    val listlength = list.size()
    println(list.sum() / listlength)
}