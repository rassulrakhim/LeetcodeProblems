import kotlin.test.assertEquals

/**
 * @author r.rakhim
 * @date 19.04.2022
 * https://leetcode.com/problems/longest-palindromic-substring/
 * Works, but pretty slow. It would much faster, if I assume to use separate function
 * to expand a palindrome and call this function 2 times, assuming odd and even palindromes.
 * However, my solution looks cleaner for me. =P
 */
fun longestPalindrome(s: String): String {
    var m = ""
    for (i in s.indices) {
        var r = i
        while (r < s.indices.last && s[r] == s[r + 1]) r++
        var l = i
        while (l > 0 && s[l] == s[l - 1]) l--
        while (l > 0 && r < s.indices.last && s[l - 1] == s[r + 1]) {
            l--
            r++
        }
        if (m.length < 1 + r - l) m = s.substring(l, r + 1)
    }
    return m
}

fun main() {
    assertEquals("abba", longestPalindrome("abba"))
    assertEquals("bb", longestPalindrome("abb"))
    assertEquals("a", longestPalindrome("ab"))
    assertEquals("bab", longestPalindrome("babcad"))
    assertEquals("bab", longestPalindrome("babad"))

}