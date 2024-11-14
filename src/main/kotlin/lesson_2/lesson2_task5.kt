package org.example.lesson_2

import kotlin.math.pow

fun main() {
    val deposit = 70000.0
    val interestRate = 0.167
    val years = 20
    val formula = deposit * (1 + interestRate).pow(years)
    val formattedFormula = String.format("%.3f", formula)

    println(formattedFormula)
}