/**
 * @author r.rakhim
 * @date 18.04.2022
 * https://leetcode.com/problems/fizz-buzz/
 */
fun fizzBuzz(n: Int): List<String> {
    val l = mutableListOf<String>()
    for (i in 1..n) {
        val a = (i % 3) == 0
        val b = (i % 5) == 0
        l.add(
            if (a && b) {
                "FizzBuzz"
            } else if (a) {
                "Fizz"
            } else if (b) {
                "Buzz"
            } else {
                i.toString()
            }
        )
    }
    return l
}


fun main() {
    println(fizzBuzz(15))
}