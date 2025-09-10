package org.example.lesson_4

    const val WEIGHT_MIN = 35
    const val WEIGHT_MAX = 100
    const val VOLUME_MAX = 100

fun main() {


    var weight = 42
    var volume = 120

    println(
        "Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': " +
                "${weight > WEIGHT_MIN && weight <= WEIGHT_MAX && volume < VOLUME_MAX}"
    )

    weight = 20
    volume = 80

    println(
        "Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': " +
                "${weight > WEIGHT_MIN && weight <= WEIGHT_MAX && volume < VOLUME_MAX}"
    )

    weight = 50
    volume = 100

    println(
        "Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': " +
                "${weight > WEIGHT_MIN && weight <= WEIGHT_MAX && volume < VOLUME_MAX}"
    )
}