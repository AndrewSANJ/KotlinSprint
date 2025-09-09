package org.example.lesson_4

fun main() {

    val currentDay = 5

    val exercisesArmDayGroup = 1
    val exercisesAbsDayGroup = 1
    val exercisesLegsDayGroup = 0
    val exercisesBackDayGroup = 0

    println(
        """
        Упражнения для рук:     ${currentDay % 2 == exercisesArmDayGroup}
        Упражнения для ног:     ${currentDay % 2 == exercisesLegsDayGroup}
        Упражнения для спины:   ${currentDay % 2 == exercisesBackDayGroup}
        Упражнения для пресса:  ${currentDay % 2 == exercisesAbsDayGroup}
        """.trimIndent()
    )
}