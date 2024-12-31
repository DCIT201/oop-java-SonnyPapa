//Concrete class(Car) showing the implementation of the abstract methods

class Truck extends Vehicle {

    public Truck(String $vehicleId, String $model, double $baseRentalRate) {
        super($vehicleId, $model, $baseRentalRate);
    }

    // Overridden Methods
    public double calculateRentalCost(int $days) {
        return getBaseRentalRate() * $days * 1.2;
    }

    public boolean isAvailableForRental() {
        return isAvailable();
    }

    public String toString() {
        return "Truck Model: " + getModel() + ", Rental Rate per Day: " + getBaseRentalRate();
    }
}