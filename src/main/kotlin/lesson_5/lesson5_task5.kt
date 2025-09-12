package org.example.lesson_5

fun main() {

    val randomNumbers = listOf((0..42).random(), (0..42).random(), (0..42).random())
    val inputsNumber = mutableListOf<Int>()

    println("Введите ${randomNumbers.size} числа от 0 до 42 включительно")
    for (i in 1..randomNumbers.size) {
        print("Число $i: ")
        inputsNumber.add(readln().toInt())
    }

    val result = randomNumbers.intersect(inputsNumber.toSet())
    val sizeResult = result.size

    when (sizeResult) {
        0 -> println("Не отгадано ни одного числа!")
        1 -> println("Вы выиграли утешительный приз!")
        2 -> println("Поздравляем! Вы выиграли крупный приз!")
        3 -> println("Вы угадали все числа и выиграли дкекпот!")
    }

    if (result.isNotEmpty()) print("Выигрышные числа: $result")

}