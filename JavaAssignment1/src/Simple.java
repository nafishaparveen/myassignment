import java.util.Scanner;

public class Simple {

	public static void main(String[] args) {
		double amount;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a principle");
		int prin = sc.nextInt();
		System.out.println("Enter a rate");
		double rate = sc.nextDouble();
		System.out.println("Enter a time");
		int time = sc.nextInt();
		
		amount=(prin*rate*time)/100;
		System.out.println("The amount is"+" " + amount);

	}

}
