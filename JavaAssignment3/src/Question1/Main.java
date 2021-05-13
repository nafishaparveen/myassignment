package Question1;

import java.util.TreeSet;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		 TreeSet<Person> ts = new TreeSet<>();
		 ts.add(new Person(120,45,"Aju"));
		 ts.add(new Person(110,35,"Anu"));
		 ts.add(new Person(160,65,"Ria"));
		 ts.add(new Person(130,65,"Ram"));
		 ts.add(new Person(105,25,"Dia"));
		 
		 for(Person element : ts)
			 System.out.println(element);
		 
	}

}
