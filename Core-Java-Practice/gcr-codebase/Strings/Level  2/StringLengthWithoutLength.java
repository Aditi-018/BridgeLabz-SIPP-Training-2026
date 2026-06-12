import java.util.Scanner;

public class StringLengthWithoutLength {

    static int findLength(String str) {
        int count = 0;

        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String text = sc.next();

        int manualLength = findLength(text);

        System.out.println("Manual Length = " + manualLength);
        System.out.println("Built-in Length = " + text.length());
    }
}