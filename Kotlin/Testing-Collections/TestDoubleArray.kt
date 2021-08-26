package me.dibe

fun main()
{
    val salaries = DoubleArray(size = 3){0.0}
    salaries[0] = 1000.0
    salaries[1] = 3000.0
    salaries[2] = 2000.0

    val salaries2 = doubleArrayOf(1500.0, 5500.0, 1210.0)

    salaries.forEach {
        print("${it} ")
    }

    println()
    println("------------------------")

    salaries.forEachIndexed { index, salary ->
        // salaries[index] += 100.0
        salaries[index] = salary + 100.0
        print("${salaries[index]} ")
    }

    println()
    println("------------------------")

    salaries2.sort()
    salaries2.forEach {
        print("${it} ")
    }
}