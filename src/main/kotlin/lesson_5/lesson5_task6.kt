package org.example.lesson_5

import kotlin.math.pow

const val BMI_MIN = 18.5
const val BMI_NORM= 25.0
const val BMI_MAX = 30.0

fun main() {

    print("Вес, кг: ")
    val weight = readln().toDouble()
    print("Рост, см: ")
    val height = readln().toDouble()

    val bodyMassIndex = weight / (height / 100).pow(2)

    val bmi = when (bodyMassIndex) {
        in 0.0..<BMI_MIN -> "Недостаточная масса тела"
        in BMI_MIN..<BMI_NORM -> "Нормальная масса тела"
        in BMI_NORM..<BMI_MAX -> "Избыточная масса тела"
        else -> "Ожирение"
    }

    println("ИМТ: ${"%.2f".format(bodyMassIndex)} - $bmi")

}