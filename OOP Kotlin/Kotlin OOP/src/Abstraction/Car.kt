package Abstraction

import CarEngine

class Car(private var name:String,private var fuel:Double) : CarEngine(){


    override fun startEngine(fuel:Double): Boolean {
        return super.startEngine(fuel)
    }

}