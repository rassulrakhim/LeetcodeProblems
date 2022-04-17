/**
 * @author r.rakhim
 * @date 15.04.2022
 * https://leetcode.com/problems/roman-to-integer/
 */


/**
 * Readable
 */
fun romanToInt(s: String): Int {
    val m = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    var sum = 0
    var prev = 0
    var curr: Int
    for (i in s.indices.last downTo 0) {
        curr = m[s[i]]!!
        sum +=
            if (prev > curr) {
                -curr
            } else {
                curr
            }
        prev = curr
    }
    return sum
}


fun main() {
    println(romanToInt("LIV"))
}