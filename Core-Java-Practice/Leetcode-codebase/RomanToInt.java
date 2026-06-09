import java.util.Scanner;

public class RomanToInt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roman Numeral: ");
        String s = sc.nextLine();

        int result = 0;

        for (int i = 0; i < s.length(); i++) {

            int curr = 0;
            int next = 0;

            switch (s.charAt(i)) {
                case 'I': curr = 1; break;
                case 'V': curr = 5; break;
                case 'X': curr = 10; break;
                case 'L': curr = 50; break;
                case 'C': curr = 100; break;
                case 'D': curr = 500; break;
                case 'M': curr = 1000; break;
            }

            if (i < s.length() - 1) {
                switch (s.charAt(i + 1)) {
                    case 'I': next = 1; break;
                    case 'V': next = 5; break;
                    case 'X': next = 10; break;
                    case 'L': next = 50; break;
                    case 'C': next = 100; break;
                    case 'D': next = 500; break;
                    case 'M': next = 1000; break;
                }
            }

            if (curr < next) {
                result -= curr;
            } else {
                result += curr;
            }
        }

        System.out.println("Integer Value: " + result);

        sc.close();
    }
}