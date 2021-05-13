
public class Employee {
	int salary;
	public void method() {
		System.out.println("salary of Employee");
	}
}

class Manager extends Employee{
	int incentive;
	public void method() {
		System.out.println("Enter the Incentive:"+ incentive);
	}
}
class Labour extends Employee{
	int overtime;
	public void method() {
		super.method();
		System.out.println("Enter the Overtime"+ overtime);
	}
	

public  class Overriding{
	public void main(String[] args) {
		Labour la = new Labour();
		la.overtime = 5000;
		la.method();
		Manager ma = new Manager();
		ma.incentive = 1000;
		ma.method();
		
		System.out.println("salary is"+ (la.overtime + ma.incentive));
		
		
	}
}
}
	

