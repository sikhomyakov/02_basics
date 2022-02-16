package ru.netology

fun main() {
    val likes = 121

    val humans: String = if (likes % 10 == 1 && likes % 100 != 11) "человеку" else "людям"
    println("Понравилось $likes $humans")
}

