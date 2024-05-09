package Inheritence

open class Animal(var name: String) {

    init {
        println("{name} object is created")
    }

    open fun canEat() {
        println("${name} can Eat")
    }

    open fun canSleep() {
        println("${name} can sleep")
    }
}