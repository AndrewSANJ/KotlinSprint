package org.example.lesson_4

fun main() {

    val criteriaIsSunnyWeather = true
    val criteriaIsOpenAwning = true
    val criteriaAirHumidity = 20
    val criteriaNotSeason = "Winter"

    val todayIsSunnyWater = true
    val todayIsOpenAwning = true
    val todayAirHumidity = 20
    val todaySeason = "Winter"

    println(
        todayIsSunnyWater == criteriaIsSunnyWeather &&
        todayIsOpenAwning == criteriaIsOpenAwning &&
        todayAirHumidity == criteriaAirHumidity &&
        todaySeason != criteriaNotSeason
    )
}