package org.example.lesson_3

fun main() {

    var from = "E2"
    var to = "E4"
    var numberMove = 1

    var dataMove = "$from-$to;$numberMove"

    println(dataMove)

    from = "D2"
    to = "D3"
    numberMove = 2

    dataMove = "$from-$to;$numberMove"

    println(dataMove)
}