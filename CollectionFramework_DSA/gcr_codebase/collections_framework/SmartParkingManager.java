import java.util.*;

public class SmartParkingManager {

    private ArrayList<String> parkedVehicles = new ArrayList<>();

    // ENTER vehicle
    public void enterVehicle(String regNo) {
        parkedVehicles.add(regNo);
        System.out.println("Vehicle entered: " + regNo);
    }

    // EXIT vehicle
    public void exitVehicle(String regNo) {
        if (parkedVehicles.remove(regNo)) {
            System.out.println("Vehicle exited: " + regNo);
        } else {
            System.out.println("Vehicle not found!");
        }
    }

    // SEARCH vehicle
    public void searchVehicle(String regNo) {
        if (parkedVehicles.contains(regNo)) {
            System.out.println(regNo + " is currently parked.");
        } else {
            System.out.println(regNo + " is NOT in parking.");
        }
    }

    // DISPLAY all
    public void displayVehicles() {
        System.out.println("\nParked Vehicles:");
        for (String v : parkedVehicles) {
            System.out.println(v);
        }
        System.out.println("Total occupied slots: " + parkedVehicles.size());
    }

    // MAIN
    public static void main(String[] args) {
        SmartParkingManager sp = new SmartParkingManager();

        sp.enterVehicle("UP14AB1234");
        sp.enterVehicle("DL10XY5678");
        sp.enterVehicle("MH12JK9999");

        sp.searchVehicle("DL10XY5678");

        sp.exitVehicle("UP14AB1234");

        sp.displayVehicles();
    }
}