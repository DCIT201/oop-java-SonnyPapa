public class Main {
    // Below is the main method with each object instantiated and initialized
    public static void main(String[] $args) {
        RentalAgency $rentalAgency = new RentalAgency();
        Vehicle $car = new Car("CAR001", "Rav-4", 60.0);
        Vehicle $motorcycle = new Motorcycle("BIKE001", "Cruiser", 50.0);
        Vehicle $truck = new Truck("TRK001", "Chevrolet Silverado", 100.0);

        $rentalAgency.addVehicle($car);
        $rentalAgency.addVehicle($motorcycle);
        $rentalAgency.addVehicle($truck);

        $rentalAgency.menu();
    }
}
