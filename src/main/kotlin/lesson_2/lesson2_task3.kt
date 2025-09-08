package org.example.lesson_2

const val MINUTES_AN_HOUR = 60
const val SECONDS_AN_MINUTE = 60

fun main() {

    val timeDepartureHour = 9
    val timeDepartureMinute = 39
    val timeOnRoadMinute = 457

    val timeArrivalTotalMinute = timeDepartureHour * MINUTES_AN_HOUR + timeDepartureMinute + timeOnRoadMinute
    val timeArrivalHour = timeArrivalTotalMinute / SECONDS_AN_MINUTE
    val timeArrivalMinute = timeArrivalTotalMinute % SECONDS_AN_MINUTE

    print("Train arrival time: ")
    print(timeArrivalHour)
    print(":")
    print(timeArrivalMinute)
}