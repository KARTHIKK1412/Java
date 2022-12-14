import java.util.*;
class Auth
{
	public static void main(String k[])
	{
		Scanner sc=new Scanner(System.in);
		char un;
		int pwd;

		System.out.println("Enter the Username");
		un=sc.next().charAt(0);

		System.out.println("Enter the password");
		pwd=sc.nextInt();


		if((un=='k') && (pwd==1412))
		{
			System.out.println("Your authencated user");
		}

		else
		{
			System.out.println("Incorrect user");
		}
	}
}