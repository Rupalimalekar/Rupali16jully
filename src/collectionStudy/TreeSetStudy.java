package collectionStudy;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetStudy {

	public static void main(String[] args)
	{
         TreeSet<Object>ts = new TreeSet<>();
         
         ts.add(12);
      //   ts.add("Hii");----->ClassCast exception
  //     ts.add(null);---------->null exception
         ts.add(234);
         ts.add(456);
         ts.add(678);
         ts.add(80);
         ts.add(15);
         
         System.out.println(ts);
         
         ts.contains(15);
         System.out.println(ts.contains(15));
         
         ts.comparator();
         System.out.println(ts.comparator());
         
        // ts.pollFirst();
         System.out.println(ts.pollFirst());
         
         System.out.println(ts.pollLast());
         

System.out.println( ts.containsAll(ts));
		
		
		System.out.println(ts.ceiling(678));
		
  System.out.println(ts.first());		
 
 // System.out.println(ts.higher(ts)); ---->Class exception
  
 
  System.out.println(ts.last());
  
//  System.out.println(ts.floor(ts));-----Class exception
  
 // System.out.println(ts.headSet(ts));--/--/---
  //=========================================================
  System.out.println("**************For each loop*****************");
  
  for(Object t:ts)
  {
	  System.out.println(t);
  }
//==========================================================
  System.out.println("**********Iterator****************");
     Iterator<Object> it = ts.iterator();
		
	while(it.hasNext())	
	{
		System.out.println(it.next());
	}
		
		
	}

}
