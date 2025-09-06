package org.example.lesson_2

import kotlin.math.pow

fun main() {

    val startAmount = 70_000
    val rate = 16.7
    val period = 20

    val endAmount = startAmount * (1 + rate / 100).pow(period.toDouble())

    println("%.3f".format(endAmount))

}