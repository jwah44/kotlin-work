// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string

fun redact(input: String, textToRedact: String, redactChar: Char='X'): String {

    val length = textToRedact.length
    var stringInput = input
    var workingArray = stringInput.toCharArray()
    var index: Int = stringInput.indexOf(textToRedact)

    while (index != -1) {
        for (i in index..(index + length - 1)) {
            workingArray[i] = redactChar
        }
        stringInput= String(workingArray)
        index = stringInput.indexOf(textToRedact)
    }
    return String(workingArray)
}
