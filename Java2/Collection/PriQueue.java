import java.util.*;
class PriQueue
{
	public static void main(String args[])
	{
		PriorityQueue<String>ls = new PriorityQueue<String>();
	
		ls.add("Pleasant");
		ls.add("Happy");
		ls.add("Nice");
		ls.add("Awesome");
		ls.add("Awful");

		System.out.println(ls);
		
		System.out.println("Head:"+ls.element());
		System.out.println(ls);

		System.out.println("Head:"+ls.peek());
		System.out.println(ls);
		
		System.out.println(ls.remove());				
		System.out.println("After removing:"+ls);
		
		System.out.println(ls.poll());
		System.out.println("After Poll method:"+ls);

		/*Iterator t=ls.iterator();
		while(t.hasNext())
		{
			System.out.println(t.next());
		}
		*/


		for(String str:ls)
		{
			System.out.println(str);
		}
	}
}	