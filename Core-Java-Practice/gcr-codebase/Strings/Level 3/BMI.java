import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int persons = 3;

        System.out.println("Height\tWeight\tBMI\tStatus");

        for(int i=0;i<persons;i++) {

            double weight = sc.nextDouble();
            double heightCm = sc.nextDouble();

            double heightM = heightCm/100;

            double bmi =
                    weight/(heightM*heightM);

            String status;

            if(bmi<18.5)
                status="Underweight";
            else if(bmi<25)
                status="Normal";
            else if(bmi<30)
                status="Overweight";
            else
                status="Obese";

            System.out.printf("%.1f\t%.1f\t%.2f\t%s\n",
                    heightCm,weight,bmi,status);
        }
    }
}