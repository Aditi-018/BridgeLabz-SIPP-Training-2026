import java.util.Scanner;

public class StudentGradeSystem {

    static String getGrade(double percentage) {

        if (percentage >= 90)
            return "A+";
        else if (percentage >= 80)
            return "A";
        else if (percentage >= 70)
            return "B";
        else if (percentage >= 60)
            return "C";
        else if (percentage >= 50)
            return "D";
        else
            return "F";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Students: ");
        int n = sc.nextInt();

        System.out.println("\nRoll\tPhy\tChem\tMath\tTotal\tPercent\tGrade");

        for (int i = 1; i <= n; i++) {

            System.out.println("\nStudent " + i);

            System.out.print("Physics: ");
            int phy = sc.nextInt();

            System.out.print("Chemistry: ");
            int chem = sc.nextInt();

            System.out.print("Maths: ");
            int maths = sc.nextInt();

            int total = phy + chem + maths;

            double percentage = total / 3.0;

            String grade = getGrade(percentage);

            System.out.printf(
                "%d\t%d\t%d\t%d\t%d\t%.2f\t%s\n",
                i, phy, chem, maths,
                total, percentage, grade
            );
        }
    }
}