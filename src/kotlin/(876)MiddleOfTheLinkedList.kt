/**
 * @author r.rakhim
 * @date 18.04.2022
 * https://leetcode.com/problems/middle-of-the-linked-list/
 */
fun middleNode(head: ListNode?): ListNode? {
    var fast = head
    var slow = head
    while (fast?.next != null) {
        fast = fast.next?.next
        slow = slow?.next
    }

    return slow


}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun main() {

}