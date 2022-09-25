fun main() {
    val color = readln()
    // put your code here
    for (enum in Rainbow.values()) {
        if(color == enum.colname) println(enum.order)
    }
}

enum class Rainbow(val colname: String, val order: Int) {
    RED("red", 1),
    ORANGE("orange", 2),
    YELLOW("yellow", 3),
    GREEN("green", 4),
    BLUE("blue", 5),
    INDIGO("indigo", 6),
    VIOLET("violet", 7),
}