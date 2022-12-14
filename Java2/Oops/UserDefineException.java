import java.util.*;
class InvalidAgeException extends Exception
{
	InvalidAgeException(String str)
	{
		super(str);
	}
}


class Test
{
	public static int age;
	public static void validate() throws InvalidAgeException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		age=sc.nextInt();

		if(age<18)
		{
			throw new InvalidAgeException("Your not eligible");
		}
		else
		{
			System.out.println("Your eligible");
		}
	}
}

class UserDefineException
{
	public static void main(String ar[])
	{
		try
		{
			Test.validate();

		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}