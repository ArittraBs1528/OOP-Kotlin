import Abstraction.Engine


open class CarEngine() : Engine {
    override fun startEngine(fuel:Double): Boolean {

        return startTurbine(fuel)
    }

    private fun startTurbine(fuel: Double): Boolean {

        return true
    }
}