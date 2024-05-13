package org.example

/**
 * C. Firewood
 * time limit per test2 seconds
 * memory limit per test512 megabytes
 * inputstandard input
 * outputstandard output
 * It's pretty cold in Berland (yes, even in May). So Monocarp has to light his fireplace.
 *
 * Monocarp has a big log of wood, which weighs 2n
 *  grams. Monocarp has watched the weather forecast and decided that he has to burn k
 *  grams of wood in the fireplace today, and the remaining 2n−k
 *  grams of wood will be used tomorrow.
 *
 * In one minute, Monocarp can use his saw to split one of his logs in half. Initially he has only one log, but of course, after splitting a log, he gets two new logs. If the weight of the log is x
 * , then each of the resulting logs has weight equal to x2
 * . Monocarp can't split logs of weight 1
 *  gram.
 *
 * Monocarp has to cut his log in such a way that some of the resulting logs weigh exactly k
 *  grams in total (and since the total weight of wood doesn't change, the remaining logs will have a total weight equal to exactly 2n−k
 * ). Help him to calculate the minimum number of minutes he has to spend cutting the logs.
 *
 * Input
 * The first line contains one integer t
 *  (1≤t≤104
 * ) — the number of test cases.
 *
 * Each test case consists of one line containing two integers n
 *  and k
 *  (1≤n≤60
 * ; 1≤k≤2n−1
 * ).
 *
 * Output
 * For each test case, print one integer — the minimum number of minutes Monocarp has to spend splitting the wood.
 */
fun runProblemC() {
    val t = readlnOrNull()?.toIntOrNull() ?: return
    for (i in 1..t) {
        val line = readlnOrNull() ?: return
        val data = line.split(" ")
        val n = data[0].toIntOrNull() ?: return
        val k = data[1].toIntOrNull() ?: return

    }
}

fun cutSplitRecursive(n, k) {

}

fun main() {
    runProblemC()
}