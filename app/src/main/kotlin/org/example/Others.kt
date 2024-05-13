package org.example

fun computeWith5CoinFirst(n: Int): Int {
    val mod1 = n % 5
    if (mod1 == 0) {
        return mod1
    }
    return mod1 % 3
}

fun computeWith3CoinFirst(n: Int): Int {
    val mod1 = n % 3
    if (mod1 == 0) {
        return mod1
    }
    return mod1 % 5
}
