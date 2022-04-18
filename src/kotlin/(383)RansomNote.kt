import kotlin.test.assertFalse
import kotlin.test.assertTrue


/**
 * @author r.rakhim
 * @date 18.04.2022
 *  https://leetcode.com/problems/ransom-note/
 *
 */
fun canConstruct(ransomNote: String, magazine: String): Boolean {
    val tempNote = ransomNote.toMutableList()
    magazine.forEach { m ->
        tempNote.remove(m)
        if (tempNote.isEmpty()) return true
    }
    return false
}


fun main() {
    assertTrue { (canConstruct("aca", "abca")) }
    assertFalse { (canConstruct("acca", "abca")) }
}