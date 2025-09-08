package org.example.lesson_1

const val MINUTES_AN_HOUR = 60
const val SECONDS_AN_MINUTE = 60

fun main() {

    val second = 6480
    val hours = second / (MINUTES_AN_HOUR * SECONDS_AN_MINUTE)
    val minutes = (second - hours * MINUTES_AN_HOUR * SECONDS_AN_MINUTE) / SECONDS_AN_MINUTE
    val seconds = second % SECONDS_AN_MINUTE

    print("%02d:%02d:%02d".format(hours, minutes, seconds))
}