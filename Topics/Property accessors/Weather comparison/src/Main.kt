class City(val name: String) {
    var degrees: Int = 0
        get() {
            return field
        }
        set(value) {
            if (value < -92 || 57 < value) {
                when (name) {
                    "Moscow", -> field = 5
                    "Hanoi", -> field = 20
                    "Dubai", -> field = 30
                }
            } else {
                field = value
            }
        }
}        

fun main() {
    val first = readLine()!!.toInt()
    val second = readLine()!!.toInt()
    val third = readLine()!!.toInt()
    val firstCity = City("Dubai")
    firstCity.degrees = first
    val secondCity = City("Moscow")
    secondCity.degrees = second
    val thirdCity = City("Hanoi")
    thirdCity.degrees = third

    // implement comparing here
    val min = minOf(firstCity.degrees, secondCity.degrees, thirdCity.degrees)
    val list = listOf(firstCity.degrees, secondCity.degrees, thirdCity.degrees)
    val listbyset = list.toSet().toList()
    if (list.size != listbyset.size) {
        print("neither")
    } else {
        if (min == firstCity.degrees) {
            println(firstCity.name)
        } else if (min == secondCity.degrees) {
            println(secondCity.name)
        } else {
            println(thirdCity.name)
        }
    }
}
