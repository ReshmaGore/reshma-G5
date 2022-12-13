package collection_Java;

import java.util.TreeSet;

public class Set_3_TreeSet {

	public static void main(String[] args) {
		
		  TreeSet<Object>ts=new TreeSet<>();
		  
		      ts.add(234);
		    //  ts.add("pune");   class cast Exception 
		      // ts.add(null);   not allowed null value----> null pointer exception
		       ts.add(12);
		      ts.add(34);
		      ts.add(3455);
		      System.out.println(ts);
	}

}
