fun main() {
    // write your code here
    val check = Ranger()
    check.println()
}

class Ranger {
    private val range1: Range = Range(readln().toInt(), readln().toInt())
    private val range2: Range = Range(readln().toInt(), readln().toInt())
    private val target: Int = readln().toInt()

    fun isInBothRange(range1: Range, range2: Range, target: Int): Boolean {
        return target in range1.min..range1.max && target in range2.min..range2.max
    }

    fun println() {
        println(isInBothRange(this.range1, this.range2, this.target))
    }
}

data class Range(
    val min: Int,
    val max: Int,
)

