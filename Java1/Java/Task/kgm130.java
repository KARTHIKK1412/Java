import java.util.*;
class kgm
{
	public static void main(String args[])
	{
		String s;
		String rev=" ";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		s=sc.next();

		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}

		System.out.println(rev);

		if(s.equals(rev))
		{
			System.out.println(s+ " is a Palindrome");
		}
		else
		{
			System.out.println(s+ " is not a Palindrome");
		}
	}
}
