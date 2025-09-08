package org.example.lesson_3

fun main() {

    val inputMove = "D2-D4;0"

    val inputMoveSplit = inputMove.split("-", ";")

    println("Фигура двигается с ${inputMoveSplit[0]} на ${inputMoveSplit[1]}, на ${inputMoveSplit[2]}-м ходу")

}