package oops.droneapp;

public class Main {
    public static void main(String[] args) {

        // Creating multiple drones
        drone drone1 = new drone( 101, 85);
        drone drone2 = new drone(102, 15);
        drone drone3 = new drone(103, 60);

        // Start deliveries
        drone1.startDelivery();
        drone2.startDelivery();
        drone3.startDelivery();

        System.out.println();

        // Display status of all drones
        drone1.displayStatus();
        drone2.displayStatus();
        drone3.displayStatus();

        // Verify shared company name
        System.out.println("Company Name from Drone 1: " + drone.company_name);
        System.out.println("Company Name from Drone 2: " + drone.company_name);
        System.out.println("Company Name from Drone 3: " + drone.company_name);
    }

}

