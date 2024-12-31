class RentalTransaction {
    private Vehicle $vehicle;
    private Customer $customer;
    private int $rentalDays;
    private double $rentalCost;

    public RentalTransaction(Vehicle $vehicle, Customer $customer, int $rentalDays) {
        this.$vehicle = $vehicle;
        this.$customer = $customer;
        this.$rentalDays = $rentalDays;
        this.$rentalCost = $vehicle.calculateRentalCost($rentalDays);
    }

    public void printReceipt() {
        System.out.println("\nRental Details:");
        System.out.println("Customer: " + $customer.getName());
        System.out.println("Vehicle: " + $vehicle.getModel());
        System.out.println("Rental Days: " + $rentalDays);
        System.out.println("Total Cost: $" + $rentalCost);
    }
}