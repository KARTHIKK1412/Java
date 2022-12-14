import java.util.*;
class Test
{
	public static int m;
	public static int validate(int a,int b) throws ArithmeticException
	{
		m=a/b;
		return m;
	}
}


class Exception
{
	public static void main(String ar[])
	{
		try
		{
			int res;
			res=Test.validate(40,0);
			System.out.println(res);

		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}