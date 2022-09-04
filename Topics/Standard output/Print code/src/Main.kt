fun main() {
    val Arr = ArrayList<String>()
    Arr.add("fun main() {")
    Arr.add("    val one = 1")
    Arr.add("    val two = 2")
    Arr.add("    println() // empty println")
    Arr.add("}")

    Arr.forEach{
        println(it)
    }

}