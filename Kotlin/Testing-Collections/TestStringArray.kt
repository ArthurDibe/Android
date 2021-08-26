package me.dibe

fun main()
{
    val values:IntArray = IntArray(5){-1} // Need to tell the size
    val values2 = intArrayOf(2, 4, 3, 1, -2, 5) // No need to tell the capacity of the array

    val names = Array<String>(size = 3){""} // Declare Strings
    val names2 = arrayOf("Dwight", "Balboa", "Jim")  // Declare and initialize individually

    names[0] = "Mary"
    names[1] = "John"
    names[2] = "Bob"

    for(name in names)
    {
        print("${name} ")
    }
    println()

    println("------------------------")
    names.sort()

    names.forEach {
        print("${it} ")
    }
    println()

    println("------------------------")
    names.sort()

    names2.forEach {
        print("${it} ")
    }
}