import kotlin.math.sqrt

fun main() {
    // do not change this code
    val number = readln().toDouble()

    // write your code below
    val spuare = Squareroot(number)
    spuare.print()
}

class Squareroot(ina: Double) {
    var sqrt = sqrt(ina)

    fun print() {
        println(this.sqrt)
    }
}
