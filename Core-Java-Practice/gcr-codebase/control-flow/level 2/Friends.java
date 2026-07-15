import java.util.Scanner;

public class Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Amar age: ");
        int aAge = sc.nextInt();

        System.out.print("Akbar age: ");
        int akAge = sc.nextInt();

        System.out.print("Anthony age: ");
        int anAge = sc.nextInt();

        System.out.print("Amar height: ");
        int aHeight = sc.nextInt();

        System.out.print("Akbar height: ");
        int akHeight = sc.nextInt();

        System.out.print("Anthony height: ");
        int anHeight = sc.nextInt();

        if (aAge < akAge && aAge < anAge)
            System.out.println("Youngest: Amar");
        else if (akAge < aAge && akAge < anAge)
            System.out.println("Youngest: Akbar");
        else
            System.out.println("Youngest: Anthony");

        if (aHeight > akHeight && aHeight > anHeight)
            System.out.println("Tallest: Amar");
        else if (akHeight > aHeight && akHeight > anHeight)
            System.out.println("Tallest: Akbar");
        else
            System.out.println("Tallest: Anthony");
    }
}