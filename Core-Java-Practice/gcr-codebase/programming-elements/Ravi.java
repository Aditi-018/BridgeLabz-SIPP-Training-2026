public class Ravi {
    public static void main(String[] args) {
        String name = "Ravi";
        int age = 23;
        int rank = 2;
        double salary = 24500;
        int membershipFee = 1500;
        int salaryBonus = (int) (0.12 * salary);

        String welcomeCard = """
        ==========================================
                WELCOME TO THE CODING GUILD 
        ==========================================

        Hello Ravi!

        We are delighted to welcome you to our
        Coding Guild community.

        => Member Details:
           Name          : Ravi
           Age           : 23
           Rank          : #2
           Salary        : ₹24500.0
           Membership Fee: ₹1500
           Bonus Earned  : ₹2940

        Keep learning, keep building,
        and keep growing! 

        Best Wishes,
        Coding Guild Team
        """;

        System.out.println(welcomeCard);
    }
}