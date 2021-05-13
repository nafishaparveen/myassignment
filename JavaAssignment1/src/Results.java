import java.util.Scanner;

public class Results {
	int m1,m2,m3;
	private void Subject() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the m of sub m1:");
		int m1 = sc.nextInt();
		System.out.println("Enter the m of sub m2:");
		int m2 = sc.nextInt();
		System.out.println("Enter the m of sub m3:");
		int m3 = sc.nextInt();
		
		System.out.println("The marks of a:"+m1);
		System.out.println("The marks of b:"+m2);
		System.out.println("The marks of c:"+m3);
		
		if(m1>=60 && m2>=60 && m3>=60) {
			System.out.println("passed");}
		else if(m1>=60 && m2>=60 || m1>=60 && m3>=60 || m2>=60 && m3>=60) {
			System.out.println("promoted");}
		else {
			System.out.println("failed");
		}
		
		}

	}


