/**
 * @author r.rakhim
 * @date 18.04.2022
 * https://leetcode.com/problems/richest-customer-wealth/
 */
fun maximumWealth(accounts: Array<IntArray>): Int {
    val a = mutableListOf<Int>()
    for (m in accounts.indices) {
        var b = 0
        for (n in accounts[m].indices) {
            b += accounts[m][n]
        }
        a.add(b)
    }

    return a.max()!!
}

fun main() {

}

