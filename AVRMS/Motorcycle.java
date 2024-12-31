//Concrete class(Car) showing the implementation of the abstract methods

class Motorcycle extends Vehicle {

    public Motorcycle(String $vehicleId, String $model, double $baseRentalRate) {
        super($vehicleId, $model, $baseRentalRate);
    }

    // Overridden Methods
    public double calculateRentalCost(int $days) {
        return getBaseRentalRate() * $days * 0.8;
    }

    public boolean isAvailableForRental() {
        return isAvailable();
    }

    public String toString() {
        return "Motorcycle Model: " + getModel() + ", Rental Rate per Day: " + getBaseRentalRate();
    }
}
