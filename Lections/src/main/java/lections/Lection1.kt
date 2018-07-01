package lections

import de.jupf.staticlog.Log

class LectionOne {
    private var amountOfMoney: Double = 0.0
    private var bottleOfWater: Int = 0
    private var cookies: Int = 0
    private var cookiesPrice: Double = 2.0
    private var waterPrice: Double = 3.5

    fun count() {
        val getCookiesPrice = cookies * cookiesPrice
        val getWaterPrice = bottleOfWater * waterPrice
        val totalPrice = getCookiesPrice + getWaterPrice
        val diff = amountOfMoney - totalPrice
        if (totalPrice > amountOfMoney) {
            Log.info("You dont have enough money")
            Log.error("You have ${amountOfMoney} dollars and the price is ${totalPrice} you stiil need ${diff}")
        } else {
            println("All right, total price is ${totalPrice} and you still have ${diff}")
        }
    }

    fun setPrices(){
        Log.info("Set price for cookies")
        cookiesPrice = readLine()!!.toDouble()
        Log.info("Set price for bottle of water")
        waterPrice = readLine()!!.toDouble()
    }

    fun initialize() {
        Log.info("Write how much money do you have")
        amountOfMoney = readLine()!!.toDouble()
        Log.info("How many cookies do you want to buy")
        cookies = readLine()!!.toInt()
        Log.info("How many bottle of water do you want to buy")
        bottleOfWater = readLine()!!.toInt()
    }
}

fun main(args: Array<String>) {
    val clazz = LectionOne()
    clazz.setPrices()
    clazz.initialize()
    clazz.count()
}