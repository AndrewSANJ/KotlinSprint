package org.example.lesson_5

fun main() {

    val hiddenNumber1 = 21
    val hiddenNumber2 = 24
    var count = 0

    println("Введите два целых числа в диапазоне от 0 до 42")
    print("Число 1: ")
    val inputNumber1 = readln().toInt()
    print("Число 2: ")
    val inputNumber2 = readln().toInt()

    if (inputNumber1 == hiddenNumber1 || inputNumber1 == hiddenNumber2) {
        count++
    }
    if (inputNumber2 == hiddenNumber1 || inputNumber2 == hiddenNumber2) {
        count++
    }

    when (count)
    {
        0 -> println("Неудача!")
        1 -> println("Вы выиграли утешительный приз!")
        2 -> println("Поздравляем! Вы выиграли главный приз!")
    }

}