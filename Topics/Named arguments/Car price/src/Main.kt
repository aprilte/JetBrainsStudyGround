import kotlin.math.max

// complete this function, add default values
fun carPrice(old: Int = 5, kilometers: Int = 100000, maximumSpeed: Int = 120, automatic: Boolean = false) {
    var carValue: Int = 20000
    carValue -= 2000 * old
    carValue += ( maximumSpeed - 120 ) * 100
    if( 0 < kilometers ) {
        carValue -= (kilometers / 10000) * 200
    }
    if(automatic) carValue += 1500

    println(carValue)
}

//fun main(){
//    println( carPrice() )
//}