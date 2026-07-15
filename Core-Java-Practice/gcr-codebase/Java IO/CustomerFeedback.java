import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.io.IOException;

public class CustomerFeedback {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            BufferedReader br = new BufferedReader(new FileReader("customer.txt"));
            String line="";
            int count=0;
            while ((line=br.readLine())!=null){
                if (line.toLowerCase().contains("good")) {
                    count++;}
            }
            System.out.println("Good Feedback Count = " + count);
        }

        catch (Exception e){
            throw new RuntimeException(e);
        }

    }

}
