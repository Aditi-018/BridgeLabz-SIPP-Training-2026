interface Trackable {
    void logActivity();

    default void resetData() {
        System.out.println("Activity data has been reset.");
    }
}

interface Reportable {
    void generateReport();
}

interface Notifiable {
    void sendAlert();
}

public class FitnessDevice implements Trackable, Reportable, Notifiable {

    @Override
    public void logActivity() {
        System.out.println("Logging daily fitness activity...");
    }

    @Override
    public void generateReport() {
        System.out.println("Generating weekly fitness report...");
    }

    @Override
    public void sendAlert() {
        System.out.println("Sending health alert...");
    }

    public static void main(String[] args) {
        FitnessDevice device = new FitnessDevice();

        device.logActivity();
        device.generateReport();
        device.sendAlert();
        device.resetData();

        System.out.println("\nJava allows multiple interface implementation.");
        System.out.println("Java does NOT allow multiple class inheritance.");
    }
}