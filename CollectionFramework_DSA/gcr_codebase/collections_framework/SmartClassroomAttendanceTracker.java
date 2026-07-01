import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SmartClassroomAttendanceTracker {

    public static void main(String[] args) {

        HashMap<String, ArrayList<String>> attendance = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n===== Smart Classroom Attendance Tracker =====");
            System.out.println("1. Mark Attendance");
            System.out.println("2. Display Attendance");
            System.out.println("3. Display Student Count");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter Subject Name: ");
                    String subject = sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String student = sc.nextLine();

                    attendance.putIfAbsent(subject, new ArrayList<String>());
                    ArrayList<String> students = attendance.get(subject);

                    if (students.contains(student)) {
                        System.out.println("Attendance already marked for this student.");
                    } else {
                        students.add(student);
                        System.out.println("Attendance marked successfully.");
                    }
                    break;

                case 2:
                    if (attendance.isEmpty()) {
                        System.out.println("No attendance records found.");
                    } else {
                        System.out.println("\nAttendance List:");
                        for (String sub : attendance.keySet()) {
                            System.out.println(sub + " : " + attendance.get(sub));
                        }
                    }
                    break;

                case 3:
                    if (attendance.isEmpty()) {
                        System.out.println("No attendance records.");
                    } else {
                        System.out.println("\nStudent Count in Each Subject:");
                        for (String sub : attendance.keySet()) {
                            System.out.println(sub + " : " + attendance.get(sub).size());
                        }
                    }
                    break;

                case 4:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}