import java.util.Scanner;

public class Compound {

	public static void main(String[] args) {
		double amount;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a principle");
		int prin = sc.nextInt();
		System.out.println("Enter a rate");
		double rate = sc.nextDouble();
		System.out.println("Enter a day");
		int n = sc.nextInt();
		
		for(int n1=1;n1<=10;n1++) {
		amount=prin*Math.pow(1+rate, n1);
		System.out.println("The amount is" +" "+ n1 +" "+amount);
		}
	}
}
