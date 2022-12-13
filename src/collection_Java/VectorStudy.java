package collection_Java;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args) {
		
		     Vector<Integer> v=new Vector<>();
		     
		      v.add(null);
		      v.add(null);
		      v.add(5);
		      v.add(78);
		      v.add(90);
		      v.add(90);
		      System.out.println(v.size());
		      System.out.println(v);
		      
		        v.add(4, 55);
		        System.out.println(v);
		        System.out.println(v.capacity());
		        System.out.println(v.size());
		        v.add(null);
		        v.add(456);
		        v.add(87);
		        System.out.println(v);
		        System.out.println(v.capacity());
		        System.out.println(v.size());
		        System.out.println(v.elementAt(5));
	// ===============================================================
		        System.out.println("=============for loop=====================");
		        for(int i=0;i<=v.size()-1;i++)
		        {
		        	System.out.println(v.get(i));
		        }
		        System.out.println("=============for each loop=====================");
		        
		        for(Integer b:v)
		        {
		        	System.out.println(b);
		        }
		        System.out.println("=============iterator=====================");
		                          Iterator<Integer> it = v.iterator();
		        while(it.hasNext())
		        {
		        	System.out.println(it.next());
		        }
		        System.out.println("=============List-iterator=====================");
		                      ListIterator<Integer> li = v.listIterator();
		        while(li.hasNext()) 
		        {
		        	System.out.println(li.next());
		        }
		        System.out.println("=============enumeration=====================");
		               Enumeration<Integer> en = v.elements();
		          while(en.hasMoreElements())
		          {
		        	  System.out.println(en.nextElement());
		          }

	}

}
