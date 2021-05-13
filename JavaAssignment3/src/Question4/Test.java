package Question4;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

class Test {
	public static void main(String[] args) {
        Emp e1 = new Emp("Groot");
        Emp e2 = new Emp("Tom");
        Emp e3 = new Emp("Jerry");
        Date d1 = new Date(18, 07, 1998);
        Date d2 = new Date(18, 07, 2000);
        Date d3 = new Date(28, 12, 1998);
       
        Map<Date, Emp> m1 = new HashMap<Date, Emp>();
        m1.put(d1,e1);
        m1.put(d1,e2);
        m1.put(d1,e3);
        m1.put(d2,e1);
        m1.put(d2,e2);
        m1.put(d3,e3);
        for(Map.Entry<Date,Emp> entry: m1.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
