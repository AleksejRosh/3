package org.example

import kotlin.math.max

fun main() {
    print(calculateCommission(5000))

}

fun calculateCommission(amount: Int): Double {
    val min: Double = 35.0
    val commission: Double = amount * 0.0075
    return max(commission, min)
}

