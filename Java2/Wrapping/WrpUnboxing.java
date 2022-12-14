import java.util.*;
class Wrp
{
	public static void main (String args[])
	{
		
		Integer i1;	//Wrapper class
		Double d;

		int a;		//int datatype
		double d1;
		
		i1=10;
		d=5.25;

		a=i1.intValue();		//Wrapper class object i1 ->a intValue()
		d1=d.doubleValue();

		System.out.println(a+" "+d1);
	}
}

