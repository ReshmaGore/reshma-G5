package collection_Java;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Set_2_LinkedHashSet {

	public static void main(String[] args) {
		
		LinkedHashSet<Object>lhs=new LinkedHashSet<>();
		
		 lhs.add("Pune");
		 lhs.add("Pune");
		 lhs.add(666);		
		 lhs.add(null);		
		 lhs.add(58.345f);		
		 lhs.add('A');
		 lhs.add(true);
		 System.out.println(lhs);
		 System.out.println("===============for each loop =====================");
		   
		 for(Object l:lhs)
		 {
			 System.out.println(l);
		 }
		 System.out.println("===============iterator =====================");
		                Iterator<Object> it = lhs.iterator();
		 while(it.hasNext())
		 {
			 System.out.println(it.next());
		 }

	}

}
