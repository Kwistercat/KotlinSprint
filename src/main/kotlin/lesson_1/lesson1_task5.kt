package org.example.lesson_1

fun main() {
    val seconds = 6480
    var minutes: Int = seconds / 60
    val hours = minutes / 60
    minutes -= 60
    println("$hours:$minutes:00")
}