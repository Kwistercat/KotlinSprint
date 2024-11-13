package org.example.lesson_2

fun main() {
    val crystal = 7
    val iron = 11
    val buff = 0.20
    val buffCrystal = (crystal * buff).toInt()
    val buffIron = (iron * buff).toInt()

    println("Бонусная кристаллическая руда: $buffCrystal")
    println("Бонусная железная руда: $buffIron")
}