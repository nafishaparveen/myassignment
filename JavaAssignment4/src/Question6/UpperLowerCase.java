package Question6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpperLowerCase {

	public static void main(String[] args) {
		List<String> ls= new ArrayList<>(Arrays.asList("A","B","C","D","ANU","Aju"));
		System.out.println(ls);
		
		ls.replaceAll(n -> n.toLowerCase());
		System.out.println(ls);
		
		ls.replaceAll(n -> n.toUpperCase());
		System.out.println(ls);
		
		

	}

}
