package org.example.lesson_4

const val MIN_COUNT_CREW = 55
const val MAX_COUNT_CREW = 70
const val MIN_CRATES_PROV = 50

fun main() {

    print("Имеет ли корабль повреждения?(true/false): ")
    val isDamage = readln().toBoolean()

    print("Число экипажа: ")
    val countCrew = readln().toInt()

    print("Число ящиков провизии: ")
    val countCratesProvisions = readln().toInt()

    print("Благоприятна ли погода?(true/false): ")
    val isWeatherFavorable = readln().toBoolean()

    println("Кораьль может отправиться в плавание: ${!isDamage && 
            countCrew in MIN_COUNT_CREW..MAX_COUNT_CREW && 
            countCratesProvisions > MIN_CRATES_PROV || 
            isDamage && 
            countCrew == MAX_COUNT_CREW && 
            countCratesProvisions >= MIN_CRATES_PROV && 
            !isWeatherFavorable}")
}