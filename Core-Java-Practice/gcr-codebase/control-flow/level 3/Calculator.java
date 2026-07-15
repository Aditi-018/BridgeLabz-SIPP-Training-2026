import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("First Number: ");
        double first = sc.nextDouble();

        System.out.print("Second Number: ");
        double second = sc.nextDouble();

        System.out.print("Operator (+,-,*,/): ");
        String op = sc.next();

        switch (op) {
            case "+":
                System.out.println("Result = " + (first + second));
                break;

            case "-":
                System.out.println("Result = " + (first - second));
                break;

            case "*":
                System.out.println("Result = " + (first * second));
                break;

            case "/":
                System.out.println("Result = " + (first / second));
                break;

            default:
                System.out.println("Invalid Operator");
        }
    }
}