import java.util.*;
import java.io.*;
public class VectorVec
{
	public static void main(String args[])
	{
		try
		{
			Vector v=new Vector(2);
			System.out.println("Size="+v.size());
	
			System.out.println("Capacity="+ v.capacity());
	
			v.addElement(1);
			v.addElement(2);
			v.addElement(200.89);
			v.addElement("KM");
			v.addElement("KM");
			v.addElement("KM");
		
			System.out.println("size="+v.size());

			System.out.println("elements of the vector="+v);
		
			System.out.println("Firstelement="+v.firstElement());
			System.out.println("Lastelement="+v.lastElement());
		
			v.removeElementAt(1);
			System.out.println("After removing the elements at intex 2:"+ v);
			
			for(Enumeration e=v.elements(); e.hasMoreElements();)   //Enumeration is a datatype to represent symbolic name for a value.
			{
				System.out.println(e.nextElement());
			}
		
			v.removeAllElements();
			System.out.println("First="+v.firstElement());
		}
		catch(Exception e)
		{

		}
	}
}




