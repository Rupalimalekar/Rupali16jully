package collectionStudy;

import java.util.LinkedList;

public class LinkedListStudy {

	public static void main(String[] args)
	{
    
	  LinkedList<Object>ll=new LinkedList<>();
	  
	  ll.add("Pune");
	  ll.add("Katraj");
	  ll.add('A');
	  ll.add(44);
	  ll.add(11.23f);
	  ll.add(true);
	  ll.add(null);
	  ll.add(null);
	  
	  System.out.println(ll);
	  
	  ll.add(6, "Velocity");
	  System.out.println(ll);
	  
	  ll.addFirst("Rupali");
	  System.out.println(ll);
	  
	  ll.addLast("Mumbai");
	  System.out.println(ll);
	  
	  ll.offer(null);
	  System.out.println(ll);
	  
	  ll.offerFirst(1234);
	  System.out.println(ll);
	  
	  ll.offerLast(12.345f);
	  System.out.println(ll);
		
	  System.out.println(ll.peek());
	  System.out.println(ll.peekFirst());
	  System.out.println(ll.peekLast());

	  ll.push("Mumbai");
	  System.out.println(ll);
	  
	  ll.poll();
	  System.out.println(ll.poll());
	  System.out.println(ll.pollFirst());
		
		
		
		
		
		
		
		
		
		
        
	}

}
