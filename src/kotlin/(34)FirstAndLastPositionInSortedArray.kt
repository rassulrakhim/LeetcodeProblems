/**
 * @author r.rakhim
 * @date 28.05.2022
 * https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 */
fun searchRange(nums: IntArray, target: Int): IntArray {
    val start = findStartingIndex(nums, target)
    val end = findEndingIndex(nums, target)
    return if (nums.isEmpty()) listOf(-1, -1).toIntArray() else listOf(start, end).toIntArray()
}

private fun findStartingIndex(nums: IntArray, target: Int): Int {
    var result = -1
    var start = 0
    var end = nums.indices.last
    while (start <= end) {
        val midpoint = start + (end - start) / 2
        if (nums[midpoint] >= target) {
            end = midpoint - 1
        } else {
            start = midpoint + 1
        }


        if (nums[midpoint] == target) result = midpoint
    }
    return result
}

private fun findEndingIndex(nums: IntArray, target: Int): Int {
    var result = -1
    var start = 0
    var end = nums.indices.last
    while (start <= end) {
        val midpoint = start + (end - start) / 2
        if (nums[midpoint] <= target) {
            start = midpoint + 1
        } else {
            end = midpoint - 1
        }
        if (nums[midpoint] == target) result = midpoint
    }
    return result
}
fun main() {
    val nums = listOf(5, 7, 7, 8, 8, 8, 9, 10).toIntArray()
    searchRange(nums, 8).forEach { println(it) }
}

