// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string

fun redact(input: String, textToRedact: String, redactChar: Char='X'): String {

    val length = textToRedact.length
    var stringInput = input // lets the string be changed
    var workingArray = stringInput.toCharArray() // cannot replace elements in a string
    var index: Int = stringInput.indexOf(textToRedact)

    if (length < 1) {
        return input
        // returns the input string if text to redact is blank
    }

    while (index != -1) { // while text to redact is present in the string
        for (i in index..(index + length - 1)) { // range: start-end of text to redact
            workingArray[i] = redactChar // replace character at index with redaction character
        }
        stringInput= String(workingArray)
        index = stringInput.indexOf(textToRedact)
    }
    return String(workingArray)
}
