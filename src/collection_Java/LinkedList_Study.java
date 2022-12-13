package collection_Java;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList_Study {

	public static void main(String[] args) {
		
        LinkedList<Object> lil=new LinkedList<>();
           
             lil.add(null);
             lil.add("pune");
             lil.add("Mumbai");
             lil.add(456);
             lil.add(null);
             lil.add(59.8f);
             lil.add(true);
             lil.add('M');
             System.out.println(lil); 
             
             lil.add(5, 30.5f);
             System.out.println(lil);
             
             lil.addFirst("Reshma");
             lil.addLast(null);
             System.out.println(lil);
             
             lil.offer("Gore");        // last element of the list
             System.out.println(lil);
           System.out.println("======================================================");  
             lil.offerFirst("Manual");
             lil.offerLast("Java");
             System.out.println(lil);
           System.out.println("======================================================");  
           
           System.out.println(lil.peek()); 
           System.out.println(lil);
           System.out.println(lil.peekFirst());
           System.out.println(lil);
           System.out.println(lil.peekLast());
           System.out.println("======================================================");  
       
            System.out.println(lil.poll());
            System.out.println(lil);
            System.out.println(lil.pollFirst());
            System.out.println(lil);
            System.out.println(lil.pollLast());
            System.out.println(lil);
            System.out.println("=====================================================");
            
            System.out.println(lil.pop());    // same as remove first method
            System.out.println(lil);
            System.out.println("=====================================================");
            
               lil.push("Mum");      // insert the element at the front of list
               System.out.println(lil);
         //=====================================================================
               
               System.out.println(lil.size());
               
               System.out.println("======================================================");
               System.out.println("==========================for loop ============================");
               
                 for(int i=0;i<=lil.size()-1;i++)
                 {
                	 System.out.println(lil.get(i));
                 }
                 
                 System.out.println("==========================for each loop ============================");
                 
              for(Object b:lil)
              {
            	  System.out.println(b);
              }
              System.out.println("==========================iterator ============================");
                                Iterator<Object> it = lil.iterator();
                         while(it.hasNext())
                         {
                        	 System.out.println(it.next());
                         }
              System.out.println("==========================List-iterator ============================");
                            ListIterator<Object> lt = lil.listIterator();
                        while(lt.hasNext())
                        {
                        	System.out.println(lt.next());
                        }
                         
	}

}
