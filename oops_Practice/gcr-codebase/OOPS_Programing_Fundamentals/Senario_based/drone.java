package oops.droneapp;

public class drone {

        int drone_id;
        int battery_percentage;
        static String company_name="abc";

        drone(int drone_id,int battery_percentage){
            this.drone_id=drone_id;
            this.battery_percentage=battery_percentage;
        }
        public void startDelivery() {
            if (battery_percentage > 20) {
                System.out.println("Drone " + drone_id + " started delivery.");
            } else {
                System.out.println("Drone " + drone_id + " has low battery. Cannot start delivery.");
            }
        } public void displayStatus() {
            System.out.println("Company Name: " + company_name);
            System.out.println("Drone ID: " + drone_id);
            System.out.println("Battery Percentage: " + battery_percentage + "%");
            System.out.println();
        }
    }

