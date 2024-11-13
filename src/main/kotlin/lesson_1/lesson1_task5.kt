package org.example.lesson_1

fun main() {
    val totalSeconds = 6480
    val secondsInHour = 3600
    val secondsInMinute = 60
    val hours = totalSeconds / secondsInHour
    val secondsAfterHours = totalSeconds % secondsInHour
    val minutes = secondsAfterHours / secondsInMinute
    val seconds = secondsAfterHours % secondsInMinute

    val formattedHours = String.format("%02d", hours)
    val formattedMinutes = String.format("%02d", minutes)
    val formattedSeconds = String.format("%02d", seconds)
    println("$formattedHours:$formattedMinutes:$formattedSeconds")
}