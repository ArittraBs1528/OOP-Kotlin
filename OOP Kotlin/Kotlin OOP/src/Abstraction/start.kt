package Abstraction

fun main() {
    var BMW: Car = Car("BMW", 1400.00)

    if (BMW.startEngine())
        println("Engine Start")
    else println("Not Started yet")
    BMW.carInformation()

}