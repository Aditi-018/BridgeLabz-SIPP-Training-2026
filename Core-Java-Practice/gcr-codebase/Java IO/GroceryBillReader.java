import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class GroceryBillReader {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("bill.txt"));

            String line;
            int count = 0;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
                count++;
            }

            br.close();

            System.out.println("Total Number of Lines = " + count);

        } catch (FileNotFoundException e) {
            System.out.println("bill.txt not found.");
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}