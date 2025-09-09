package org.example.lesson_4

const val TABLES_TOTAL = 13

fun main() {

    val reservationTablesToday = 13
    val reservationTablesTomorrow = 9

    println(
        "Доступность столиков на сегодня: ${reservationTablesToday < TABLES_TOTAL}\n" +
                "Доступность столиков на завтра: ${reservationTablesTomorrow < TABLES_TOTAL}"
    )

}
