import java.util.*;
class SetInterFacee
{
	public static void main(String args[])
	{

		TreeSet<Integer> t=new TreeSet<Integer>();
		t.add(14);
		t.add(12);
		t.add(94);
		t.add(14);
		t.add(5);
		t.add(97);
		System.out.println(t);
	
		Iterator<Integer> s=t.iterator();
		while(s.hasNext())
		{
			System.out.println(s.next());
		}

		System.out.println("TreeSet:");
		TreeSet<Integer> t1=new TreeSet<Integer>();
		t1.add(125);
		t1.add(586);
		t1.add(333);
		t1.add(996);
		t1.add(557);
		t1.add(497);
		System.out.println(t1);
	
		System.out.println("LinkedSet:");
		LinkedHashSet<String> t2=new LinkedHashSet<String>();
		t2.add("eight");
		t2.add("two");
		t2.add("four");
		t2.add("seven");
		t2.add("three");
		t2.add("one");
		System.out.println(t2);
	
	}
}
	
	