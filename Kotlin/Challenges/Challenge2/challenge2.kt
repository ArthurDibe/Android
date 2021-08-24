fun main(args: Array<String>) {
    
    for (i in 1..readLine()!!.toInt()) {
        val input = readLine()!!.split(" ").map { it.toInt() }

        if(input.size == 2) println(mdc(input[0], input[1]))
    }
}

// greatest comom divisor (recursive call)
fun mdc(n1: Int, n2: Int): Int 
{
    val R:Int = n1 % n2
    var result:Int = 0

    if(R > 0) result = mdc(n2, R)
    else result = n2
    
    return result
}