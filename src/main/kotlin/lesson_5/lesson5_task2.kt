package org.example.lesson_5

import java.time.LocalDate

const val AGE_OF_MAJORITY = 18

fun main() {

    print("Введите свой год рождения: ")
    val birthYear = readln().toInt()

    val currentYear = LocalDate.now().year

    val userAge = currentYear - birthYear

    if (userAge >= AGE_OF_MAJORITY) {
        println("Показать экран со скрытым контентом")
    } else {
        println("Вернуться на главный экран приложения")
    }
}