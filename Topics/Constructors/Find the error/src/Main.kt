// You can experiment here, it won’t be checked

fun main(args: Array<String>) {
  // put your code here
}

class Letter(val from: String, val to: String, val text: String = "Greetings, my dear friend!") {}

class Country(_name: String, _capital: String, _population: Int) {
    val name = _name
    val capital = _capital
    val population = _population
}

class Room(val width: Int, val length: Int, var height: Int) {
    init {
        width += 3
        length += 5
        height -= 1
    }
}