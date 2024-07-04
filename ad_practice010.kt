/*
 * Android Developer 練習問題: Kotlin の基本
 * 10. 2 つの数を比較する
 */

fun main() {
    println(compareSteps(300, 250))
    println(compareSteps(300, 300))
    println(compareSteps(200, 220))
}

fun compareSteps(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    return timeSpentToday > timeSpentYesterday
}
