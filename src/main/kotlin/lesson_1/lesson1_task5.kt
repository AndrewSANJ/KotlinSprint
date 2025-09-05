package org.example.lesson_1

fun main() {
    val second = 6480
    val hours = second/3600
    val minutes = (second - hours*3600)/60
    val seconds = second % 60

    print(hours.toString().padStart(2,'0'))
    print(":")
    print(minutes.toString().padStart(2,'0'))
    print(":")
    print(seconds.toString().padStart(2,'0'))
}