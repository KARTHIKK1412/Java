import java.util.*;
class HashMapInter
{
	public static void main(String args[])
	{
		Map<Integer,String> hm= new HashMap<Integer,String>();
		
		//hm.put(01,"zero one");
		hm.put(14,"one four");
		hm.put(94,"nine four");
		hm.put(05,"zero five");
		hm.put(97,"nine seven");
		hm.put(01,"zero one");

		System.out.println(hm);
		for(Map.Entry m: hm.entrySet())
		{
			System.out.println("Key:" +m.getKey()+ "    Value  "+m.getValue());

		}

		System.out.println(hm.entrySet());
	
		hm.remove(01,"zero one");
		System.out.println(hm);
	}
}