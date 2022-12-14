import java.util.*;
class Dq
{
	public static void main(String args[])
	{
		Deque<String>ls = new ArrayDeque<String>();
	
		ls.add("Happy");
		ls.add("Nice");
		ls.add("Awesome");

		System.out.println("elements in the Queue:"+ls);

	
		ls.addFirst("Morning");
		System.out.println("elements in the Queue:"+ls);
		
		ls.addLast("Evening");
		System.out.println("elements in the Queue:"+ls);

		ls.removeFirst();
		System.out.println("elements in the Queue:"+ls);

		ls.removeLast();
		System.out.println("elements in the Queue:"+ls);
	}
}