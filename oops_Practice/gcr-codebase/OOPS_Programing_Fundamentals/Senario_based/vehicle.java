package oops;

class ChargingStation {
    
    // Static variables
    static int totalStations = 0;
    static double electricityRate = 8.5; // per unit

    // Instance variables
    int stationId;
    int unitsConsumed;

    // Constructor
    ChargingStation(int stationId, int unitsConsumed) {
        this.stationId = stationId;
        this.unitsConsumed = unitsConsumed;

        totalStations++; // increment station count
    }

    // Calculate bill
    double calculateBill() {
        return unitsConsumed * electricityRate;
    }

    // Display details
    void displayStationDetails() {
        System.out.println("Station ID: " + stationId);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Electricity Rate: " + electricityRate);
        System.out.println("Bill Amount: " + calculateBill());
        System.out.println();
    }
}

public class Vehicle {
    public static void main(String[] args) {

        ChargingStation s1 = new ChargingStation(101, 120);
        ChargingStation s2 = new ChargingStation(102, 150);
        ChargingStation s3 = new ChargingStation(103, 200);
        ChargingStation s4 = new ChargingStation(104, 180);
        ChargingStation s5 = new ChargingStation(105, 250);

        s1.displayStationDetails();
        s2.displayStationDetails();
        s3.displayStationDetails();
        s4.displayStationDetails();
        s5.displayStationDetails();

        System.out.println("Total Stations: " + ChargingStation.totalStations);

        // Changing electricity rate affects all stations
        ChargingStation.electricityRate = 10.0;

        System.out.println("\nAfter changing electricity rate:\n");
        s1.displayStationDetails();
    }
}