import java.util.Scanner;
import java.time.YearMonth;

public class CalendarDisplay {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int year = sc.nextInt();

        YearMonth ym = YearMonth.of(year,month);

        System.out.println(ym);
        System.out.println("Days = "+ym.lengthOfMonth());
    }
}