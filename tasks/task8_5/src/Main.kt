// Task 8.5: example of using a higher-order function

fun main() {
    // Add your testing code here
    val text = readln()
    val output = text.howMany { it.lowercase() in "bcdfghjklmnpqrstvwxyz"}
    println(output)
}
