import java.util.*;
class ArryList
{
	public static void main(String args[])
	{
		ArrayList<String>ls = new ArrayList<String>();		//ArrayList - Class name ls - object

		ls.add("Apple");
		ls.add("Mango");
		ls.add("Kiwi");
		ls.add("Orange");
		ls.add("Apple");
		ls.add("Banana");
		
		System.out.println("showing all elements");

		for(String str:ls)
		{
			System.out.println(str);
		}
/*
		Iterator it = ls.iterator();		//Iterator - Searching from top to bottom
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
*/
		
		System.out.println("Remove Element:"+ls.remove(2));
		System.out.println("Get element using syntex:"+ls.get(3));
		System.out.println("Remove elements starting letter 'A'"+(ls.removeIf(n->(n.charAt(0)=='A'))));		//Remove Starting letter A in Arrarlist(Apple)
		System.out.println("After remove single elements");

		for(String str:ls)
		{
			System.out.println(str);
		}

	}
}