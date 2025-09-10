package org.example.lesson_5

fun main() {

    val registeredName = "Zaphod"
    val registeredPassword = "PanGalactic"

    print("Введите имя: ")
    val name = readln()
    if (name != registeredName) {
        println("Пожалуйста, зарегестрируйтесь")
        return
    }

    print("Теперь введите пароль: ")
    val password = readln()
    if (password != registeredPassword) {
        println("Пароль не верный!")
        return
    }

    println("Ваши данные проверены, и о, чудо, они верны... Пользователь \"$name\", вам разрешено входить на борт корабля \"Heart of Gold\".")
}