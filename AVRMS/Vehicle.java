import java.util.ArrayList;
import java.util.List;

//Absract base class, abstract methods and the normal methods
abstract class Vehicle {
    private String $vehicleId;
    private String $model;
    private double $baseRentalRate;
    private boolean $isAvailable;

    public Vehicle(String $vehicleId, String $model, double $baseRentalRate) {
        this.$vehicleId = $vehicleId;
        this.$model = $model;
        this.$baseRentalRate = $baseRentalRate;
        this.$isAvailable = true;
    }

    public String getVehicleId() {
        return $vehicleId;
    }

    public String getModel() {
        return $model;
    }

    public double getBaseRentalRate() {
        return $baseRentalRate;
    }

    public boolean isAvailable() {
        return $isAvailable;
    }

    public void rent() {
        if ($isAvailable) {
            $isAvailable = false;
        }
    }

    public void returnVehicle() {
        $isAvailable = true;
    }

    public abstract double calculateRentalCost(int $days);

    public abstract boolean isAvailableForRental();
}
