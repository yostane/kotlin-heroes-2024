package org.example

import kotlin.math.min

val problemACache = mutableMapOf<Int, Int>()

fun runProblemA() {
    val t = readlnOrNull()?.toIntOrNull() ?: return
    for (i in 1..t) {
        val line = readlnOrNull() ?: return
        val n = line.toIntOrNull() ?: return
        val restult = computeRecursive(n)
        println(restult)
    }
}

fun computeRecursive(n: Int): Int {
    return if (problemACache.containsKey(n)) {
        problemACache.getValue(n)
    } else if (n < 3) {
        n
    } else if (n < 5) {
        n - 3
    } else if (n == 5) {
        0
    } else {
        val r1 = computeRecursive(n - 3)
        val r2 = computeRecursive(n - 5)
        val r = min(r1, r2)
        problemACache[n] = r
        r
    }
}