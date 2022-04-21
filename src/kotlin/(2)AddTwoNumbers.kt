/**
 * @author r.rakhim
 * @date 18.04.2022
 * https://leetcode.com/problems/add-two-numbers/
 * TODO: Wrong Answer here.
 */
fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    var i = 1
    var t1 = l1
    var t2 = l2
    var v1 = 0
    var v2 = 0
    while (t1 != null || t2 != null) {
        if (t1 != null) {
            v1 += t1.`val` * i
            t1 = t1.next
        }
        if (t2 != null) {
            v2 += t2.`val` * i
            t2 = t2.next
        }
        i *= 10
    }
    val v3 = v1 + v2
    val b = v3.toString().reversed().toList().map { it.toString().toInt() }.toList()
    var head = ListNode(b[0])
    var tail = head
    for (a in b.indices-0) {
        tail.next = ListNode(b[a])
        tail = tail.next!!
    }
    return head
}


fun main() {
    var a = ListNode(2)
    var b = ListNode(4)
    var c = ListNode(3)

    var d = ListNode(5)
    var e = ListNode(6)
    var f = ListNode(4)

    a.next = b
    b.next = c

    d.next = e
    e.next = f

    var g = addTwoNumbers(a, d)
    while (g != null) {
        print(g.`val`)
        g = g.next
    }
}

