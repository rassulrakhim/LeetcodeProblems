/**
 * @author r.rakhim
 * @date 21.04.2022
 * https://leetcode.com/problems/reverse-integer/
 */
fun reverse(x: Int): Int {
    val n = x < 0
    val m = if (n) -1 else 1
    var s: Long = x.toLong() * m
    var currentDigit: Long
    var result = 0L
    while (s > 0) {
        currentDigit = s % 10L
        s /= 10
        result = result * 10 + currentDigit
    }
    return if (result < Int.MAX_VALUE) result.toInt() * m else 0

}

fun main() {
    println(reverse(-366666665))
}