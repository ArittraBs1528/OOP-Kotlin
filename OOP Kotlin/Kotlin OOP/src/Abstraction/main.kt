// Define an abstract class for vehicles
abstract class Vehicle(
    val id: String,
    val manufacturer: String,
    val yearOfManufacture: Int
) {
    // Public method to get fuel efficiency
    fun getFuelEfficiency(): Double {
        return calculateFuelEfficiency() // Delegate the calculation to the private method
    }

    // Private abstract method for calculating fuel efficiency
    protected  abstract fun calculateFuelEfficiency(): Double
}

// Define a class for cars
class Car(
    id: String,
    manufacturer: String,
    yearOfManufacture: Int,
    private val fuelConsumption: Double // Fuel consumption in liters per 100 kilometers
) : Vehicle(id, manufacturer, yearOfManufacture) {
    // Override the private method to calculate fuel efficiency for cars
    override fun calculateFuelEfficiency(): Double {
        return 100.0 / fuelConsumption // Fuel efficiency in kilometers per liter
    }
}

// Define a class for trucks
class Truck(
    id: String,
    manufacturer: String,
    yearOfManufacture: Int,
    private val fuelConsumption: Double // Fuel consumption in liters per kilometer
) : Vehicle(id, manufacturer, yearOfManufacture) {
    // Override the private method to calculate fuel efficiency for trucks
    override fun calculateFuelEfficiency(): Double {
        return 1 / fuelConsumption // Fuel efficiency in kilometers per liter
    }
}

// Define a class for bicycles
class Bicycle(
    id: String,
    manufacturer: String,
    yearOfManufacture: Int
) : Vehicle(id, manufacturer, yearOfManufacture) {
    // Override the private method to calculate fuel efficiency for bicycles
    override fun calculateFuelEfficiency(): Double {
        // Bicycles don't use fuel, so their fuel efficiency is infinite
        return Double.POSITIVE_INFINITY
    }
}

fun main() {
    val vehicles = listOf(
        Car("C001", "Toyota", 2019, 10.5),
        Truck("T001", "Volvo", 2018, 0.2),
        Bicycle("B001", "Giant", 2020)
    )

    for (vehicle in vehicles) {
        println("Vehicle ID: ${vehicle.id}")
        println("Manufacturer: ${vehicle.manufacturer}")
        println("Year of Manufacture: ${vehicle.yearOfManufacture}")
        println("Fuel Efficiency: ${vehicle.getFuelEfficiency()} km/l\n") // Accessing through public method
    }
}
