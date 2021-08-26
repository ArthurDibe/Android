package me.dibe

import java.math.BigDecimal

fun Array<BigDecimal>.sumAll() = this.reduce { acc, value ->
    acc + value
}

fun Array<BigDecimal>.avg() =
    if(this.isEmpty()) BigDecimal.ZERO
    else this.sumAll()/this.size.toBigDecimal()