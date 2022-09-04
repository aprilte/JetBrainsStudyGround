fun main() {
    var (a, b) = readLine()!!.split(" ").map { it.toInt() }
    // Write only exchange actions here. Do not touch the lines above
    val c = swap(a, b)
    a = c.first
    b = c.second

    // Do not touch the lines below
    print("$a $b")
}

fun swap (a:Int, b:Int): Pair<Int, Int>{
    return Pair(b, a)
}