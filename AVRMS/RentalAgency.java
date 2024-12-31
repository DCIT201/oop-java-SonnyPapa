import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RentalAgency {
    private List<Vehicle> $vehicles;
    private List<Customer> $customers;
    private List<RentalTransaction> $rentals;

    public RentalAgency() {
        $vehicles = new ArrayList<>();
        $customers = new ArrayList<>();
        $rentals = new ArrayList<>();
    }

    public void addVehicle(Vehicle $vehicle) {
        $vehicles.add($vehicle);
    }

    public void addCustomer(Customer $customer) {
        $customers.add($customer);
    }

    public void rentVehicle(Vehicle $vehicle, Customer $customer, int $days) {
        if ($vehicle.isAvailableForRental()) {
            $vehicle.rent();
            RentalTransaction $transaction = new RentalTransaction($vehicle, $customer, $days);
            $rentals.add($transaction);
            $transaction.printReceipt();
        } else {
            System.out.println("Vehicle is not available for rent.");
        }
    }

    public void returnVehicle(Vehicle $vehicle) {
        $vehicle.returnVehicle();
        System.out.println("Vehicle returned successfully.");
    }

    public void menu() {
        Scanner $scanner = new Scanner(System.in);
        int $choice = -1;

        // Error handling using the do while loop and the try and catch blocks
        do {
            try {
                System.out.println("***** Hii Welcome to my Vehicle Rental System *****");
                System.out.println("1. Rent a Vehicle");
                System.out.println("2. Return a Vehicle");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");

                $choice = $scanner.nextInt();
                $scanner.nextLine();

                switch ($choice) {
                    case 1:
                        for (Vehicle $vehicle : $vehicles) {
                            if ($vehicle.isAvailableForRental()) {
                                System.out.println($vehicle.getVehicleId() + ": " + $vehicle.toString());
                            }
                        }
                        System.out.print("Enter vehicle ID: ");
                        String $vehicleId = $scanner.nextLine();

                        System.out.print("Enter days to rent: ");
                        int $days = $scanner.nextInt();
                        $scanner.nextLine();

                        System.out.print("Enter your name: ");
                        String $customerName = $scanner.nextLine();

                        Vehicle $selectedVehicle = null;
                        for (Vehicle $vehicle : $vehicles) {
                            if ($vehicle.getVehicleId().equals($vehicleId)) {
                                $selectedVehicle = $vehicle;
                                break;
                            }
                        }

                        if ($selectedVehicle != null) {
                            Customer $customer = new Customer("CUS" + ($customers.size() + 1), $customerName);
                            addCustomer($customer);
                            rentVehicle($selectedVehicle, $customer, $days);
                        } else {
                            System.out.println("Invalid vehicle ID.");
                        }
                        break;
                    case 2:
                        System.out.print("Enter vehicle ID to return: ");
                        String $returnVehicleId = $scanner.nextLine();

                        Vehicle $selectedReturnVehicle = null;
                        for (Vehicle $vehicle : $vehicles) {
                            if ($vehicle.getVehicleId().equals($returnVehicleId)) {
                                $selectedReturnVehicle = $vehicle;
                                break;
                            }
                        }

                        if ($selectedReturnVehicle != null) {
                            returnVehicle($selectedReturnVehicle);
                        } else {
                            System.out.println("Invalid vehicle ID.");
                        }
                        break;
                    case 3:
                        System.out.println("Exiting the system. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (Exception $e) {
                System.out.println("Error: Invalid input. Please enter a valid number.");
                $scanner.nextLine(); 
            }
        } while ($choice != 3);

        $scanner.close();
    }

}
