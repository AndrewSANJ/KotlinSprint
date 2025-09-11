package org.example.lesson_5

import kotlin.math.pow

fun main() {

    print("Вес, кг: ")
    val weight = readln().toDouble()
    print("Рост, см: ")
    val height = readln().toDouble()

    val bodyMassIndex = weight / (height / 100).pow(2)

    val bmi = if (bodyMassIndex < 18.5) {
        "Недостаточная масса тела"
    } else if (bodyMassIndex in 18.5..<25.0) {
        "Нормальная масса тела"
    } else if (bodyMassIndex in 25.0..<30.0) {
        "Избыточная масса тела"
    } else "Ожирение"

    println("ИМТ: ${"%.2f".format(bodyMassIndex)} - $bmi")
}