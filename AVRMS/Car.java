//Concrete class(Car) showing the implementation of the abstract methods
class Car extends Vehicle {

    public Car(String $vehicleId, String $model, double $baseRentalRate) {
        super($vehicleId, $model, $baseRentalRate);
    }

    // Overridden Methods
    public double calculateRentalCost(int $days) {
        return getBaseRentalRate() * $days;
    }

    public boolean isAvailableForRental() {
        return isAvailable();
    }

    public String toString() {
        return "Car Model: " + getModel() + ", Rental Rate per Day: " + getBaseRentalRate();
    }
}
