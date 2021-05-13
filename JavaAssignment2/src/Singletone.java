
public class Singletone {
	private static Singletone sobject;
	
	private Singletone() {
	}
	
	public static Singletone getInstance() {
		if(sobject==null)
			sobject = new Singletone();
		return sobject;
		
	}
	public void getConnection() {
		System.out.println("Connected");
		
	}
	public static void main(String[] args) {
		Singletone s1 = new Singletone();
		s1.getInstance();
		s1.getConnection();
	
	}

}
