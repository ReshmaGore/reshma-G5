package collection_Java;

import java.util.ArrayList;

public class ArrayList_Study {

	public static void main(String[] args) {
		
		ArrayList <Object> al=new ArrayList<>();
		  
		al.add("Pune");
		al.add(1234);
		al.add("Pune");
		al.add(22.5f);
		al.add(null);
		al.add('B');
		al.add(null);
		al.add(true);
      System.out.println(al);
      System.out.println("===============================================");
      
      // if i want to add the index value then ----> add(int index  object element) 
          
               al.add(3, "velocity"); 
            System.out.println(al);
      System.out.println("===============================================");
             //  al.clear();
           // System.out.println(al);
     //======================================================================
          // isEmpty() method use
           System.out.println(al.isEmpty());
      System.out.println("===============================================");
           // contains() method 
           System.out.println(al.contains(1234));
      System.out.println("===============================================");
           // clone(); ---> by using new object we can achieve duplication output of al object
                Object al1=al.clone();
                System.out.println(al1);
      //==========================================================================
                     // equals method();
                System.out.println(al.equals(al1));
      //==========================================================================
                     // get() method
                System.out.println(al.get(2));
                System.out.println(al.get(5));
       //========================================================================== 
                    // indexOf();
                System.out.println(al.indexOf(true));
                System.out.println(al.indexOf('B'));
       //======================================================================
                System.out.println("===============================================");
                // remove() method
                System.out.println(al.remove(7));
                System.out.println(al.remove(0));
                  System.out.println(al);
             System.out.println("===============================================");
                System.out.println(al.set(3, "hello"));
                  System.out.println(al);
             System.out.println("===============================================");
                System.out.println(al.size());
             System.out.println("===============================================");
             
             ArrayList<Integer>al2=new ArrayList<>();
                
                al2.add(1);
                al2.add(2);
                al2.add(3);
                al2.add(4);
                System.out.println(al2);
                
	}

}
