/**
 * @author r.rakhim
 * @date 18.04.2022
 * https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/
 */
fun kWeakestRows(mat: Array<IntArray>, k: Int): IntArray {
    val a = mutableListOf<Pair<Int, Int>>()
    for (m in mat.indices) {
        var b = 0
        for (n in mat[m].indices) {
            if (mat[m][n] == 1) b++
        }
        a.add(Pair(m, b))
    }
    a.sortBy { it.second }
    return a.subList(0, k).map { it.first }.toIntArray()
}


fun main() {
    val a = listOf(1, 1, 0, 0, 0).toIntArray()
    val b = listOf(1, 1, 1, 1, 0).toIntArray()
    val c = listOf(1, 0, 0, 0, 0).toIntArray()
    val d = listOf(1, 1, 0, 0, 0).toIntArray()
    val e = listOf(1, 1, 1, 1, 1).toIntArray()
    val f = listOf(a, b, c, d, e).toTypedArray()

    kWeakestRows(f, 3).forEach { print(it) }
}