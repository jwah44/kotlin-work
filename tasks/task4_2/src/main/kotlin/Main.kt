// Task 4.2: use of if and ranges

fun main() {
    // Add your code here
    println("PIZZA MENU\n" +
            "(a) Margherita\n" +
            "(b) Pepperoni\n" +
            "(c) Hawaiian\n" +
            "(d) BBQ Chicken\n\n" +
            "Choose your pizza (a-d):")

    val letter = readln().lowercase()

    val orderChoice = if (letter in "a".."d" && letter.length == 1) {
        "Order accepted"
    }
    else {
        "Invalid choice!"
    }
    println(orderChoice)
}
