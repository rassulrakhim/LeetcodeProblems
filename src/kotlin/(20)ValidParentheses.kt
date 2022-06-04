import java.util.*

/**
 * @author r.rakhim
 * @date 04.06.2022
 * https://leetcode.com/problems/valid-parentheses/
 * So basic rule here is "last opened bracket must be closed first".
 * To keep information about all opened brackets in order FIFO we can use stacks.
 * We will push opening brackets into our stack and pop them if same closing bracket, otherwise
 * our [s] is not  valid.
 */
fun isValid(s: String): Boolean {
    val isSameBracket = listOf(1, 2)
    val openingBracket = listOf(123, 91, 40)
    val stack: Stack<Int> = Stack()
    s.forEach {
        val b = it.toInt()
        if (openingBracket.contains(b)) {
            stack.push(b)
        } else {
          if(!stack.isEmpty() && isSameBracket.contains(b - stack.peek())){
              stack.pop()
          }else{
              return false
          }
        }
    }
    return stack.isEmpty()
}

fun main() {
    println(isValid("{}"))
}