// Interface
interface Refuelable {
    void refuel();
}

// Superclass
class Vehicle {
    protected int maxSpeed;
    protected String model;

    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public void displayVehicle() {
        System.out.println("Model      : " + model);
        System.out.println("Max Speed  : " + maxSpeed + " km/h");
    }
}

// Subclass
class ElectricVehicle extends Vehicle {

    public ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    public void charge() {
        System.out.println("Electric Vehicle is charging...");
    }
}

// Subclass implementing interface
class PetrolVehicle extends Vehicle implements Refuelable {

    public PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    public void refuel() {
        System.out.println("Petrol Vehicle is being refueled...");
    }
}

// Main Class
public class VehicleManagement {
    public static void main(String[] args) {

        ElectricVehicle ev =
                new ElectricVehicle("Tesla Model 3", 220);

        PetrolVehicle pv =
                new PetrolVehicle("Honda City", 180);

        System.out.println("Electric Vehicle Details:");
        ev.displayVehicle();
        ev.charge();

        System.out.println("\nPetrol Vehicle Details:");
        pv.displayVehicle();
        pv.refuel();
    }
}