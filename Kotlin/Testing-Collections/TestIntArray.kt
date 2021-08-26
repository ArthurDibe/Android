package me.dibe

fun main()
{
    val values:IntArray = IntArray(5){-1} // Need to tell the size
    values[4] = 1
    values[3] = 2
    values[2] = 10
    values[1] = 23


    for(i in 0..values.size-1)
        print("${values[i]}, ")

    println()
    println("----------------------------")
    for(index in values.indices)
        print("${values[index]}, ")

    println()
    println("----------------------------")
    for(element in values)
        print("${element}, ")

    println()
    println("----------------------------")
    values.forEach{ it:Int ->
        print("${it}, ")
    }

    println()
    println("----------------------------")
    values.sort()
    values.forEach{
        print("${it}, ")
    }

}