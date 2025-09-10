package org.example.lesson_4

const val AIR_HUMIDITY = 20
const val NOT_SEASON = "Winter"

fun main() {

    val isSunny = true
    val isAwningOpen = true
    val airHumidity = 20
    val season = "Winter"

    println(
        isSunny &&
        isAwningOpen &&
        airHumidity == AIR_HUMIDITY &&
        season != NOT_SEASON
    )
}