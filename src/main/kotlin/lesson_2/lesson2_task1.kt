package org.example.lesson_2

fun main() {

    val scoreStudent1 = 3
    val scoreStudent2 = 4
    val scoreStudent3 = 3
    val scoreStudent4 = 5

    val countStudents = 4

    val average: Float = (scoreStudent1.toFloat() + scoreStudent2 + scoreStudent3 + scoreStudent4) / countStudents

    println("%.2f".format(average))

}