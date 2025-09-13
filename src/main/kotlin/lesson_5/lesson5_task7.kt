package org.example.lesson_5

fun main() {

    print("Расстояние поездки, км: ")
    val distance = readln().toDouble()

    print("Расход топлива на 100 км, л: ")
    val consumption = readln().toDouble()

    print("Цена за литр, руб: ")
    val price = readln().toDouble()

    val fuel = distance * consumption / 100

    val cost = fuel * price

    println(
        "Необходимое количество топлива: $fuel л\n" +
                "общей стоимостью ${"%.2f".format(cost)} рублей"
    )
}