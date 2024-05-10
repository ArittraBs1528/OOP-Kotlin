package Abstraction

import CarEngine

class Car(private var carModel: String, private var fuel: Double) : CarEngine(fuel) {


    override fun startEngine(): Boolean {


        if (super.startEngine() && fuel - 200.00 > 1100.00) {
            return true
        } else return false

    }

    fun carInformation() {
        println("Car Model  $carModel")
        println("Current Fuel $fuel")
    }

}