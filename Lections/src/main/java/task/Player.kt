package task

import java.util.Random

class Player {
    var random = Random()
    var name: String = ""
    var age: Int = 0
    var skill: Int = random.nextInt(100)
}