import java.util.*;
public class CheckNaturalNumber{
	public static void main(String[]args){
	Scanner sc= new Scanner (System.in);
	System.out.println("enter a natural no");
	int n1=sc.nextInt();
	if(n1>0){
		System.out.println("This natural no");
	int sum=n1*(n1+1)/2;
	System.out.println("This sum of"+n1+"is this " + sum );}
	else
		System.out.println("This are not natural no");
		}
		}