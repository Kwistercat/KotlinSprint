package org.example.lesson_2

fun main() {
    val workers = 50
    val workersPayment = 30000
    val trainees = 30
    val traineesPayment = 20000

    val workersCosts = workers * workersPayment
    val traineesCosts = trainees * traineesPayment
    val allCosts = workersCosts + traineesCosts
    val mean = allCosts / (workers + trainees)

    println(workersCosts)
    println(allCosts)
    println(mean)
}