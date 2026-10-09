infix fun String.anagramOf(str: String): Boolean {
    if (this.length != str.length) {
        return false
    }
    val firstChars = this.lowercase().toList().sorted()
    val secondChars = str.lowercase().toList().sorted()
    return firstChars == secondChars
}