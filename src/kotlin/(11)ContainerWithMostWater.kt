/**
 * @author r.rakhim
 * @date 19.04.2022
 * https://leetcode.com/problems/container-with-most-water/
 */
fun maxArea(height: IntArray): Int {
    var m = 0
    var l = 0
    var r = height.indices.last
    while (r - l > 0) {
        m = m.coerceAtLeast((r - l) * Math.min(height[l], height[r]))
        if (height[r] > height[l]) l++ else r--
    }
    return m
}


fun main() {
    val array = listOf(1, 8, 6, 2, 5, 4, 8, 3, 7).toIntArray()
    println(maxArea(array))
}