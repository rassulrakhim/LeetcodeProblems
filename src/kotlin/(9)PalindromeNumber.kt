/**
 * @author r.rakhim
 * @date 21.04.2022
 */
fun isPalindrome(x: Int): Boolean {
    var s = x
    var r = 0
    while (s != 0) {
        val digit = s % 10
        r = r * 10 + digit
        s /= 10
    }
    return if (x < 0) false else r == x
}

fun main() {
    println(isPalindrome(-434))
}