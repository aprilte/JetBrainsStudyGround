import kotlin.math.sqrt
const val SPI: Double = 3.14

fun main() {
    // write your code here
    val type = readln()

    val inputField = arrayListOf<Double>()
    when (type) {
        "triangle", -> for (i in 0..2) { inputField.add(readln().toDouble()) }
        "rectangle", -> for (i in 0..1) { inputField.add(readln().toDouble()) }
        "circle", -> inputField.add(readln().toDouble())
    }

    println(
        when (type) {
            "triangle", -> triangle(inputField[0], inputField[1], inputField[2]).toString()
            "rectangle", -> (inputField[0] * inputField[1]).toString()
            "circle", -> (inputField[0] * inputField[0] * SPI).toString()
            else -> "0.0"
        }
    )
}

fun triangle(a: Double, b: Double, c: Double): Double {
    val s = (a + b + c) / 2.0
    return sqrt(s * (s - a) * (s - b) * (s - c))
}