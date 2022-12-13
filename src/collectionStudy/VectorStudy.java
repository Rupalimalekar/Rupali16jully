package collectionStudy;


import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy {

	public static void main(String[] args)
	{
       Vector<Integer> v = new Vector<>();

       v.add(12);
       v.add(22);
       v.add(null);
       v.add(null);
      v.add(null);
      v.add(123);
      
      System.out.println(v);
      
      System.out.println(v.size());
      
      System.out.println(v.set(1, 14));
      System.out.println(v.capacity());
      
      System.out.println(v.elementAt(3));
 //For loop,for each loop,iterator,list iterator,enumeration
      System.out.println("======================For loop=====================");
      for(int i=0;i<=v.size()-1;i++)
      {
    	System.out.println(v.get(i));  
      }
//================================================================
      System.out.println("====================For each loop====================");
      
      for(Object ve:v)
      {
    	  System.out.println(ve);
      }
//==========================================================================
      System.out.println("==========================Iterator========================");
      
       Iterator<Integer> it = v.iterator();
       
       while(it.hasNext())
    	   System.out.println(it.next());
//===========================================================================================
       System.out.println("==========================List Iterator========================");
                       ListIterator<Integer> li = v.listIterator();
       
       while(li.hasNext())
       {
    	   System.out.println(li.next());
       }
//============================================================================
       System.out.println("=====================Enumeration===============================");
         Enumeration<Integer> el = v.elements();
         while(el.hasMoreElements())
         {
        	 System.out.println(el.nextElement());
         }
       
       
       
       
       
       
       
	}

}
