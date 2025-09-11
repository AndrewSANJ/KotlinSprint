package org.example.lesson_5

fun main() {

    val number1 = (1..9).random()
    val number2 = (1..9).random()

    println("Решите простой математический пример")
    print("$number1 + $number2 = ")

    val result = readln().toInt()

    if (number1 + number2 == result) {
        println("Добро пожаловать!")
    } else {
        println("Доступ запрещен.")
    }
}