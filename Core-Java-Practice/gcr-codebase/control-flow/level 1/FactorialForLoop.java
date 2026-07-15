import java.util.Scanner;

public class FactorialForLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("The number is not a natural number.");
        } else {
            long factorial = 1;

            for (int i = 1; i <= n; i++) {
                factorial = factorial * i;
            }

            System.out.println("Factorial of " + n + " is " + factorial);
        }
    }
}