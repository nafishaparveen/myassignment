import java.util.Scanner;

public class Cui {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		String n="Naffu";
		String p="groot";
		
		for(int i=0;i<=2;i++) {
			System.out.println("Enter name");
			String name = sc.next();
			System.out.println("enter pass");
			String pass = sc.next();
			if(n.equals(name) && p.equals(pass)) {
				System.out.println("Welcome"+" " +name);
				break;
				
			}
			count++;
		}
		if(count>=3) {
			System.out.println("Contact Admin");
		}
	}

}
