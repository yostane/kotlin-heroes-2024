package org.example

fun runProblemB() {
    val t = readlnOrNull()?.toIntOrNull() ?: return
    for (i in 1..t) {
        val line = readlnOrNull() ?: return
        val data = line.split(" ")
        val k = data[0].toIntOrNull() ?: return
        val v = data[1].toIntOrNull() ?: return

        val step = v / k
        if ((step + 1) % 3 == 0) {
            println(0)
        } else {
            val remainingStep = 3 - ((step + 1) % 3)
            val toWait = k * (remainingStep + step) - v
            println(toWait)
        }
    }
}

fun main() {
    runProblemB()
}
