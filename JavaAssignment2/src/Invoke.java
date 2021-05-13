
abstract class Persistsnce{
	public abstract void persist();
}

class Filepersistance extends Persistsnce{
	public void persist() {
		System.out.println("Welcome to the world");
	}
}

class Databasepersistance extends Persistsnce{
	public void persist() {
		System.out.println("Welcome to my land");
	}
}
public class Invoke {

	public static void main(String[] args) {
		Persistsnce per = new Filepersistance();
		per.persist();
		Persistsnce per1 = new Databasepersistance();
		per1.persist();

	}

}
