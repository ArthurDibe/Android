package me.dibe

fun main()
{
    val salaries = arrayOf(
        "2000".toBigDecimal(),
        "1500".toBigDecimal(),
        "4000".toBigDecimal()
    )

    print("SUM ALL extension function: ")
    println(salaries.sumAll())
    print("AVG extension function: ")
    println(salaries.avg())
}