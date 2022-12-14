package machine

fun main(){
    var store1 = coffeeMC(550, 400, 540, 120, 9)

    while( store1.continuation ) {
        store1.branchOption(store1.awaitAction())
    }
}

class coffeeMC(_money: Int, _water: Int, _milk: Int, _bean: Int, _cups: Int){
    var money = _money
    var water = _water
    var milk = _milk
    var bean = _bean
    var cups = _cups
    var continuation: Boolean = true

    val espressoCosts = coffeeCosts(250, 0, 16, 1, 4)
    val latteCosts = coffeeCosts(350, 75, 20, 1, 7)
    val cappuccinoCosts = coffeeCosts(200, 100, 12, 1, 6)

    fun balanceStock(cost: coffeeCosts){
        //実際は作れるか見てから計算するのだ
        val (acceptable, lack) = orderAcceptable(cost)
        if( acceptable ) {
            this.water -= cost.water
            this.milk -= cost.milk
            this.bean -= cost.bean
            this.cups -= cost.cup
            this.money += cost.money
            println("I have enough resources, making you a coffee!")
        }else{
            // cannot make it
            println("sorry, not enough ${lack}!")
        }
    }

    private fun orderAcceptable(cost: coffeeCosts): Pair<Boolean, String> {
        if(this.water < cost.water){
            return Pair(false, "water")
        }
        if(this.milk < cost.milk){
            return Pair(false, "milk")
        }
        if(this.bean < cost.bean){
            return Pair(false, "bean")
        }
        if(this.cups < 1){
            return Pair(false, "cup")
        }
        return Pair(true, "enough")
    }

    fun printStock(){
        println("The coffee machine has:")
        println("${water} ml of water")
        println("${milk} ml of milk")
        println("${bean} g of coffee beans")
        println("${cups} disposable cups")
        println("$${money} of money")
    }

    fun awaitAction(): String {
        println("Write action (buy, fill, take, remaining, exit):")
        val order = readln()
        return when(order){
            "buy" -> "buy"
            "fill" -> "fill"
            "take" -> "take"
            "remaining" -> "remaining"
            "exit" -> "exit"
            else -> "nop"
        }
    }

    fun branchOption(_action: String) {
        when( _action ) {
            "buy" -> buy()
            "fill" -> fill()
            "take" -> take()
            "remaining" -> this.printStock()
            "exit" -> this.continuation = false
            else -> nop()
        }
    }

    private fun buy(){
        println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ")
        val order = readln()
        if(order == "1"){
            balanceStock(espressoCosts)
        }else if(order == "2"){
            balanceStock(latteCosts)
        }else if(order == "3") {
            balanceStock(cappuccinoCosts)
        }else if(order == "back"){
            nop()
        }else{
            nop()
        }
    }
    private fun fill(){
        println("Write how many ml of water you want to add:")
        val _water = -1 * readln().toInt()
        println("Write how many ml of milk you want to add:")
        val _milk = -1 * readln().toInt()
        println("Write how many grams of coffee beans you want to add:")
        val _bean = -1 * readln().toInt()
        println("Write how many disposable cups you want to add:")
        val _cup = -1 * readln().toInt()

        val _money = 0
        var fillingPseudoCost = coffeeCosts(_water,_milk,_bean,_cup,_money)
        balanceStock(fillingPseudoCost)
    }
    private fun take(){
        println("I gave you $${this.money}")
        this.money = 0//oops
    }

    private fun nop(){
        //nothing
    }


}

data class coffeeCosts(
    val water: Int,
    val milk: Int,
    val bean: Int,
    val cup: Int,
    val money: Int,
)
