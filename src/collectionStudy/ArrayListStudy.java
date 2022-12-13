package collectionStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListStudy {

	public static void main(String[] args)
	{

		ArrayList<Object> al=new ArrayList<>();
		
		al.add("Pune");
		al.add("Rupali");
		al.add(null);
		al.add(123);
		al.add(null);
		al.add(null);
		al.add(11.22f);
		al.add('A');
		al.add(true);
	System.out.println("========Methods=======================");	
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.set(1, "Velocity"));
		System.out.println(al.get(2));
		System.out.println(al.isEmpty());
		System.out.println(al.clone());
System.out.println("==============================================");		
		
		
		
		
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
	//======================== for each loop======================
		for(Object a:al)
		{
			System.out.println(a);
		}
	System.out.println("=============Iterator======================");
	           Iterator<Object> it = al.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("=================ListIterator===================");
		    ListIterator<Object> li = al.listIterator();
		    while(li.hasNext())
		    {
		    	System.out.println(li.next());
		    }

	}

}
