/**
 * @author r.rakhim
 * @date 19.04.2022
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/
 */
fun lengthOfLongestSubstring(s: String): Int {
//Sliding windows approach
    var l = 0
    var r = 0
    var max = 0
    val m =  hashMapOf<Char,Int>()
    while (r <= s.indices.last) {
        if(m[s[r]] == null) m[s[r]]= 1
        else m[s[r]] = m[s[r]]!!.plus(1)
        while (m[s[r]]!! > 1) {
            m[s[l]] = m[s[l]]!!.minus(1)
            l++
        }
        max = max.coerceAtLeast(r - l+1)
        r++
    }
    return max
}

fun main(){
    println(lengthOfLongestSubstring("abcabcbb"))
}