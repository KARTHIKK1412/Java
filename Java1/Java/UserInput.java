import java.util.*;
class UserInput
{
	public static void main(String mk[])
	{
		Scanner ob=new Scanner(System.in);
		int n1,n2,n3;
		
		System.out.println("Enter the first number:");
		n1=ob.nextInt();
		
		System.out.println("Enter the second number:");
		n2=ob.nextInt();
		
		n3=n1+n2;

		System.out.println("output");
		System.out.println("product of a number is:"+n3);	
	}
}
		