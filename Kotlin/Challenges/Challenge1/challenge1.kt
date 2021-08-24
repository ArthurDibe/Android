import kotlin.math.pow

fun main() {
    val n = 1..(readLine() ?: return).toInt()
    n.forEach {n1->
        println("$n1 ${(n1.toDouble().pow(2)).toInt()} ${(n1.toDouble().pow(3)).toInt()}")
        println("$n1 ${(n1.toDouble().pow(2)).toInt() + 1} ${(n1.toDouble().pow(3)).toInt() + 1}")
    }
}