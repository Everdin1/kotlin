package task

import java.util.*

class Couch{
    var random = Random()
    var couchName: String = ""
    var luckyLevel: Double = random.nextDouble().coerceAtMost(1.5).coerceAtLeast(0.5)
}

fun main(args: Array<String>) {
    var game = Couch()
    println(game.luckyLevel)
}