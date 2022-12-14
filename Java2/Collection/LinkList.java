import java.util.*;
public class LinkList
{
	public static void main(String args[])
	{
		LinkedList ll=new LinkedList();
		ll.add("k");
		ll.add("a");
		ll.add("r");
		ll.add("t");
		ll.add("h");
		ll.add("i");
	
		System.out.println("Original contents:"+ll);


		ll.addLast("k");
		System.out.println("Contents after adding 'k' at last:"+ll);


		ll.addFirst("m");
		System.out.println("Contents after adding 'm' at first :"+ll);

		ll.remove("k");
		System.out.println("Contents after removeing 'k':"+ll);

		ll.addLast("km");
		System.out.println("Contents after adding 'km':"+ll);

		ll.removeFirst();
		System.out.println("Contents after using removeFirst:"+ll);

		ll.removeLast();
		System.out.println("Contents after using removeLast:"+ll);

		Object val=ll.get(5);
		System.out.println("Printing the value:"+val);
		System.out.println("getfirst:" + ll.getFirst());
		System.out.println("getlast:" + ll.getLast());
	}
}




