package org.example.lesson_2

fun main() {

    val employees = 50
    val salaryEmployee = 30000
    val interns = 20
    val salaryIntern = 20000

    val expensesEmployees = employees * salaryEmployee
    val expensesIntern = interns * salaryIntern
    val expensesTotal = expensesEmployees + expensesIntern
    val averageSalary = expensesTotal / (employees + interns)

    println(expensesEmployees)
    println(expensesTotal)
    println(averageSalary)

}