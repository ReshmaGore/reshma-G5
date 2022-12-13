package collection_Java;

import java.util.HashSet;
import java.util.Iterator;

public class Set_1_HashSet {

	public static void main(String[] args) {
		
		 HashSet<Object>hs=new HashSet<>();
		 
		 hs.add("one");
		 hs.add(345);
		 hs.add("one");
		 hs.add(null);
		 hs.add('t');
		 hs.add(null);
		 hs.add(true);
		 hs.add(345);
		 
		 System.out.println(hs);
		 // set does not supports traversing using for loop 
		 System.out.println("=============for each loop==========================");
		   for(Object h:hs)
		   {
			   System.out.println(h);
		   }
		 System.out.println("=============iterator==========================");
			     Iterator<Object> it = hs.iterator();
			     
			  while(it.hasNext())
			  {
				  System.out.println(it.next());
			  }

	}

}
