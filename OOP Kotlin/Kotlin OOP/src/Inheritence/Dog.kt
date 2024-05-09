package Inheritence

//i have to use the parent class constructor
//you dont need to decalre any name varaible on Dog class
class Dog(name: String, var canBark: Boolean) : Animal(name) {

    init {
        println("$name object is created")
    }

    override fun canEat() {
        super.canEat()

    }

    override fun canSleep() {
        super.canSleep()
    }

    open fun canBark() {

        if (canBark.equals(true))
            println("$name can bark")
        else println("$name is sick")
    }

}