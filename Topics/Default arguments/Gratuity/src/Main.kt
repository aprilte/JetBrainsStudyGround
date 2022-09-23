fun tip(bill: Int, percentage: Int = 10): Int {
    // TODO
    return ( bill * ( percentage.toFloat() / 100.0 ) ).toInt()
}
//
//fun main(){
//    println(tip(readln().toInt(), readln().toInt()))
//}