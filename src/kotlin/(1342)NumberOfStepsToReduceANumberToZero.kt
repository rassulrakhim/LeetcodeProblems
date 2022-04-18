/**
 * @author r.rakhim
 * @date 18.04.2022
 * https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
 */
fun numberOfSteps(num: Int): Int {
    var a = num
    var s = 0
    while (a > 0) {
        if (a % 2 == 0) {
            a = a.div(2)
            s++
        } else {
            a -= 1
            s++
        }
    }
    return s
}


fun main() {
    println(numberOfSteps(14))
}