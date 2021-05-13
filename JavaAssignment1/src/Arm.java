
public class Arm {

	public static void main(String[] args) {
		int i,a,n,arm=0;
		System.out.println("Armstrong number between 100 to 999 are");
		for(i=100;i<=1000;i++)
		{
		n=i;
		arm=0;
		while(n>0)
		{
			a=n%10;
			arm=arm+(a*a*a);
			n=n/10;
		}
		if(arm==i)
			System.out.println(i);
		}

	}

}
