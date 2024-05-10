open class CarEngine(private var fuel: Double) {


    open fun startEngine(): Boolean {
        return startTurbine(fuel)
    }


    private fun startTurbine(fuel: Double): Boolean {

        if (fuel > 1200)
            return true
        else return false
    }
}