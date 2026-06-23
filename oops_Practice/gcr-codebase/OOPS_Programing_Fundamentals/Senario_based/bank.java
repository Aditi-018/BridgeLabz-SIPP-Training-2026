package oops;
class Bankaccount{
    int accountNumber;
    String Holder_name;
    double balance;
    static int totalAccounts=0;
    Bankaccount(int accountNumber,String Holder_name,double balance){
        this.accountNumber=accountNumber;
        this.Holder_name=Holder_name;
        this.balance=balance;
        totalAccounts++;
    }
    void deposit(double amount){
        balance+=amount;
        System.out.println("deposited "+amount);
    }
    //withdraw karna h yaha
    void withdraw(double amount){
        if(balance>=amount){
            balance-=amount;
            System.out.println("withdrawn");
        }
        else{
            System.out.println("Not enough balance");
        }

    }
    void getStatement() {
        System.out.println("\nAccount Number : " + accountNumber);
        System.out.println("Holder Name    : " + Holder_name);
        System.out.println("Balance        : ₹" + balance);
    }

}
public class bank {
    public static void main(String[] args) {
    Bankaccount bank1= new Bankaccount(101,"aditi",20000);
    Bankaccount bank2= new Bankaccount(102,"anjali",70000);
    Bankaccount bank3=new Bankaccount(103,"yash",80000);

        //transaction for bank1
        bank1.deposit(4000);
        bank1.withdraw(2000);
        bank1.deposit(8000);
        bank1.withdraw(5000);
        bank1.deposit(200);

        //bank2
        bank2.deposit(9000);
        bank2.withdraw(2000);
        bank2.deposit(4000);
        bank2.withdraw(500);
        bank2.deposit(2000);

        //bank3
        bank3.deposit(900);
        bank3.withdraw(200);
        bank3.deposit(4000);
        bank3.withdraw(5000);
        bank3.deposit(20);

        System.out.println("all bank details");
        bank1.getStatement();
        bank2.getStatement();
        bank3.getStatement();
    }

}
