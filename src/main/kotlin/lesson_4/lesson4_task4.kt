package org.example.lesson_4

const val EXERCISES_ARM_DAY_GROUP = 1
const val EXERCISES_ABS_DAY_GROUP = 1
const val EXERCISES_LEGS_DAY_GROUP = 0
const val EXERCISES_BACK_DAY_GROUP = 0

fun main() {

    val currentDay = 5

    println(
        """
        Упражнения для рук:     ${currentDay % 2 == EXERCISES_ARM_DAY_GROUP}
        Упражнения для ног:     ${currentDay % 2 == EXERCISES_LEGS_DAY_GROUP}
        Упражнения для спины:   ${currentDay % 2 == EXERCISES_BACK_DAY_GROUP}
        Упражнения для пресса:  ${currentDay % 2 == EXERCISES_ABS_DAY_GROUP}
        """.trimIndent()
    )

}