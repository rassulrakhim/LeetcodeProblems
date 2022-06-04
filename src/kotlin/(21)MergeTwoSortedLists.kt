/**
 * @author r.rakhim
 * @date 04.06.2022
 * https://leetcode.com/problems/merge-two-sorted-lists/
 * So lets look at the constraints:
 * 1) Both lists can be empty -> return null
 * 2) One of lists is empty -> return head of second list
 * Solving:
 * We could do it recursive way.
 * We will decide which head is smaller, send the rest of the smallest list and other list into
 * recursion and return the smallest list.
 */
fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    if (list1 == null || list2 == null) return list1 ?: list2  //if one of them null return not null one
    return if (list1.`val` > list2.`val`) {
        list2.next = mergeTwoLists(list1, list2.next)
        list2
    } else {
        list1.next = mergeTwoLists(list1.next,list2)
        list1
    }
}

fun main() {

    var a = ListNode(1)
    var b = ListNode(2)
    var c = ListNode(4)

    var d = ListNode(1)
    var e = ListNode(3)
    var f = ListNode(4)

    a.next = b
    b.next = c

    d.next = e
    e.next = f

    var ad = mergeTwoLists(a, d)
    println("----")
    while (ad != null) {
        println(ad.`val`)
        ad = ad.next
    }
}