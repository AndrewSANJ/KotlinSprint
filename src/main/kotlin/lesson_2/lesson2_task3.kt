package org.example.lesson_2

fun main() {

    val timeDepartureHour = 9
    val timeDepartureMinute = 39
    val timeOnRoadMinute = 457

    val timeArrivalTotalMinute = timeDepartureHour * 60 + timeDepartureMinute + timeOnRoadMinute
    val timeArrivalHour = timeArrivalTotalMinute / 60
    val timeArrivalMinute = timeArrivalTotalMinute % 60

    print("Train arrival time: ")
    print(timeArrivalHour)
    print(":")
    print(timeArrivalMinute)

}