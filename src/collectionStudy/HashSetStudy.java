package collectionStudy;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudy {

	public static void main(String[] args)
	{
       HashSet<Object>hs = new HashSet<>();
       
       hs.add(222);
       hs.add(222);
       hs.add(null);
       hs.add(null);
       hs.add("Rupali");
       hs.add('B');
       hs.add(22.123f);
       hs.add(true);
       System.out.println(hs);
       
       System.out.println( hs.contains('B'));
       
       System.out.println(hs);
       hs.add("Baramati");
		System.out.println(hs);
		
		hs.clone();
		System.out.println(hs);

		System.out.println(hs.isEmpty());
//*******************For each loop**********************************	
		System.out.println("***************for each loop*******************");
		for(Object h:hs)
		{
			System.out.println(h);
		}
//==============================================================================
		System.out.println("*****************Iterator************************");
		
		Iterator<Object> it = hs.iterator();
		
    while(it.hasNext()) 
    {
    	System.out.println(it.next());
    }
	}

}
