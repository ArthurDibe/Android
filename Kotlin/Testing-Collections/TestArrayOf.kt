package me.dibe

fun main()
{
    val values = intArrayOf(2, 4, 3, 1, -2, 5) // No need to tell the capacity of the array

    values.sort()
    values.forEach {
        print("${it} ")
    }
    println()
}