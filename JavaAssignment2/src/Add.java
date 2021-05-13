class Bank{
	public void method() {
		System.out.println("Welcome to the Bank");
	}
}

class Saving extends Bank{
	int fixed_deposit;
	int fixed_deposit() {
		return 0;
	}
	public void method() {
		System.out.println("Enter a amount of FD:" + fixed_deposit);
	}
}

class Current extends Bank{
	int cash_credits;
	public void method() {
		System.out.println("Enter a amount of CC:" + cash_credits);
	}
}
public class Add {

	public static void main(String[] args) {
		Saving s = new Saving();
		s.fixed_deposit = 10000;
		s.method();
		Current c = new Current();
		c.cash_credits = 25000;
		c.method();
		System.out.println("Total amount is" + (s.fixed_deposit + c.cash_credits));

	}

}
