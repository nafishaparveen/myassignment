package Question5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringExample {

	public static void main(java.lang.String[] args) {
		StringBuilder str = new StringBuilder();
		List<String> ll= new ArrayList<>(Arrays.asList("Abc","Bcd","Cde","Def","mno","pqr"));
		ll.forEach(word -> str.append(word.charAt(0)));
		System.out.println(str);

	}

}
