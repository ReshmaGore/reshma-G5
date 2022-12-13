package collection_Java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_Study1 {

	public static void main(String[] args) {
	
		ArrayList<Object> al=new ArrayList<>();
		    
		al.add("Vlocity");
		al.add(1234);
		al.add("Pune");
		al.add(null);
		al.add(null);
		al.add('A');
		al.add("true");
		al.add(22.5f);
		System.out.println(al);
		System.out.println("================for loop==============");
		
		   for(int i=0;i<=al.size()-1;i++)
		   {
			   System.out.println(al.get(i));
		   }
		   System.out.println("================for each loop=============="); 
		   
		  for(Object a:al)
		  {
			  System.out.println(a);
		  }
		  System.out.println("================iterator=============="); 
		      Iterator<Object> it = al.iterator();
		   while(it.hasNext())
		   {
			   System.out.println(it.next());
		   }
		   System.out.println("================List iterator==============");
		                    ListIterator<Object> li = al.listIterator();
		     while(li.hasNext())
		     {
		    	 System.out.println(li.next());
		     }

	}

}
