class Test
{
	public static void validate(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Your eligible");
		}
		else
		{
			System.out.println("your not eligible");
		}
	}
}


class ThrowEx
{
	public static void main(String ar[])
	{
		Test.validate(20);
		System.out.println("The Rest of code");
	}
}