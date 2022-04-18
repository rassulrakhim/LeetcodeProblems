import kotlin.test.assertEquals


/**
 * @author r.rakhim
 * @date 18.04.2022
 * https://leetcode.com/problems/roman-to-integer/
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


const val FIFTY_FOUR_ROMAN = "LIV"
const val THOUSEND_NINE_HUNDRED_NINTY_FOUR = "MCMXCIV"

fun main() {
    assertEquals(romanToInt(FIFTY_FOUR_ROMAN), 54)
    assertEquals(romanToInt(THOUSEND_NINE_HUNDRED_NINTY_FOUR), 1994)
}

