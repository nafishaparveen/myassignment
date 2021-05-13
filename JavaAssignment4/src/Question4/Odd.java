package Question4;

import java.util.ArrayList;
import java.util.List; 

public class Odd {

	public static void main(String[] args) {
		List<Integer> ls= new ArrayList<>();
		ls.add(1);
		ls.add(2);
		ls.add(3);
		ls.add(4);
		ls.add(5);
		ls.add(6);
		
		ls.removeIf(n -> n%2!=0);
		System.out.println(ls);

	}

}
