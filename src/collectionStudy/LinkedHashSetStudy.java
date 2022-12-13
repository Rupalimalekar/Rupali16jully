package collectionStudy;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetStudy {

	public static void main(String[] args)
	{

     LinkedHashSet<Object>ls = new LinkedHashSet<>();
     
     ls.add("Pune");
     ls.add("Katraj");
     ls.add(null);
     ls.add(true);
     ls.add('F');
     ls.add(2345);
     ls.add(45.55f);
     System.out.println(ls);
     
     ls.spliterator();
	//	System.out.println(ls.spliterator());
//=========================================================
     System.out.println("***********For each loop************");
		
	for(Object h:ls)
	{
		System.out.println(h);
	}
//=====================================================================
	System.out.println("***********Iterator************************");
	
	Iterator<Object> it = ls.iterator();
	   while(it.hasNext())
	   {
		   System.out.println(it.next());
	   }
	
	
	
		
		
		
		
	}

}
