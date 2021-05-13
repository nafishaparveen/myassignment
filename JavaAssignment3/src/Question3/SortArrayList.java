package Question3;

import java.util.ArrayList;
import java.util.ListIterator;

public class SortArrayList {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
			al.add("Ram");
			al.add("Tina");
			al.add("Aju"); 
			al.add("Alia");
			al.add("Priya");
			
			ListIterator<String> list1=al.listIterator(al.size());  
			 while(list1.hasPrevious())  
	         {  
	             String str=list1.previous();  
	             System.out.println(str);  
	         }  
			
}
}
