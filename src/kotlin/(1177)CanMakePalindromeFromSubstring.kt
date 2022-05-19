/**
 * @author r.rakhim
 * @date 28.04.2022
 * https://leetcode.com/problems/can-make-palindrome-from-substring/discuss/824483/Kotlin-Prefix-Sums
 */
fun canMakePaliQueries(s: String, queries: Array<IntArray>): List<Boolean> {
    var pre = Array(s.length + 1) { IntArray(26) }
    var res = mutableListOf<Boolean>()
    for ((i, c) in s.withIndex()) {
        pre[i + 1] = pre[i].clone()
        ++pre[i + 1][c - 'a']
    }
    for (q in queries) {
        val l = q[0]
        val r = q[1]
        var k = q[2]
        var odd = 0
        for (c in "abcdefghijklmnopqrstuvwxyz") {
            odd += (pre[r + 1][c - 'a'] - pre[l][c - 'a']) % 2
        }
        res.add((odd / 2) <= k)
    }
    return res
}

fun main() {
    val s = "abcda"
    var a = Array(1) { IntArray(3) }
    a[0] = listOf(1, 2, 0).toIntArray()
    canMakePaliQueries(s, a).forEach { println(it) }
}