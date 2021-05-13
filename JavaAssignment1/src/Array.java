import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		int a[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int val = sc.nextInt();
		int flag=0;
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]==val) {
				System.out.println(val + "is found");
				flag=1;
				break;
			}
		}if(flag==0)
		{
			System.out.println(val + "is not found");
		}

	}

}
