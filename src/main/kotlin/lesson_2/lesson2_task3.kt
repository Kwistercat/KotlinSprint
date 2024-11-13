package org.example.lesson_2

fun main() {
    val startHour = 9
    val startMinutes = 39
    val onTheWayMinutes = 457
    val minutesInOneHour = 60

    val startTotalMinutes = startHour * minutesInOneHour + startMinutes
    val onTheWayTotalMinutes = startTotalMinutes + onTheWayMinutes
    val arriveHour = onTheWayTotalMinutes / minutesInOneHour
    val arriveMinutes = onTheWayTotalMinutes % minutesInOneHour

    val formattedArrivalHour = String.format("%02d", arriveHour)
    val formattedArrivalMinute = String.format("%02d", arriveMinutes)
    println("$formattedArrivalHour:$formattedArrivalMinute")
}