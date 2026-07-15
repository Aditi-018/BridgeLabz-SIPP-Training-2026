import java.io.*;
import java.util.Scanner;

public class DailyExpenseLogger {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Expense Category: ");
            String category = sc.nextLine();

            System.out.print("Enter Amount: ");
            int amount = sc.nextInt();

            // true => append mode
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("expenses.txt", true));

            bw.write(category + " - " + amount);
            bw.newLine();

            bw.close();

            System.out.println("Expense Saved Successfully!");

        } catch (IOException e) {
            System.out.println("Error while writing to file.");
        }

        sc.close();
    }
}