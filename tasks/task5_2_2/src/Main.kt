// Task 5.2.2: conversion of marks into grades, using a function
fun grade(mark: Int) = when (mark) {
    in 0..39   -> "Fail"
    in 40..69  -> "Pass"
    in 70..100 -> "Distinction"
    else       -> "?"
}

fun main(args: Array<String>) {
    val grades = args.toList()

    var i = 0

    for (i in grades.indices) {
        val passToGrade = grades[i].toInt()
        val displayGrade = grade(passToGrade)
        println("$passToGrade is a $displayGrade")
    }
}