package machine

fun main(){
    println("Write how many ml of water the coffee machine has:")
    val water: Int = readln().toInt()
    println("Write how many ml of milk the coffee machine has:")
    val milk: Int = readln().toInt()
    println("Write how many grams of beans the coffee machine has:")
    val bean: Int = readln().toInt()
    println("Write how many cups of coffee you will need:")
    val cup: Int = readln().toInt()

    val (neededWater, neededMilk, neededBean) = Triple(water*200, milk*50, bean*15)
    val howmuchucantake = checkQty(water, milk, bean)

    if( cup <= howmuchucantake ){
        print("Yes, I can make that amount of coffee")
        if( 1 <= (howmuchucantake-cup) ){
            println(" (and even ${howmuchucantake-cup} more than that)")
        }
    }else{
        println("No, I can make only ${howmuchucantake} cups of coffee")
    }


}

fun checkQty(water:Int, milk:Int, bean:Int):Int {
//how much you can take
    val (qWater, qMilk, qBean) = Triple( (water/200), (milk/50), (bean/15) )
    return minOf(qWater,qMilk, qBean)
}

fun main2() {
//    println("Write how many cups of coffee you will need: > ")
//    val qty : String? = readLine() ?: "1"
//    var cupz = "cup"
//    val water : Int = qty!!.toInt() * 200
//    val milk  : Int = qty!!.toInt() * 50
//    val bean  : Int = qty!!.toInt() * 15
//
//    if( 1 < qty!!.toInt() ){
//        cupz += "s"
//    }
//    if( cupz == "cup" ){
//        println("For "+cupz+" of coffee you will need:")
//    }else {
//        println("For " + qty + " " + cupz + " of coffee you will need:")
//    }
//    print(water)
//    println(" ml of water")
//    print(milk)
//    println(" ml of milk")
//    print(bean)
//    println(" g of coffee beans")
}
