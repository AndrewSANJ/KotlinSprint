package org.example.lesson_4

fun main() {
    val weightMin = 35
    val weightMax = 100
    val volumeMax = 100

    var weight = 42
    var volume = 120

    println(
        "Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': " +
                "${weight > weightMin && weight <= weightMax && volume < volumeMax}"
    )

    weight = 20
    volume = 80

    println(
        "Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': " +
                "${weight > weightMin && weight <= weightMax && volume < volumeMax}"
    )

    weight = 50
    volume = 100

    println(
        "Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': " +
                "${weight > weightMin && weight <= weightMax && volume < volumeMax}"
    )
}