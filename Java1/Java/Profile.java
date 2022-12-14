import java.util.*;
class Profile
{
	public static void main(String mk[])
	{
		Scanner s=new Scanner(System.in);

		String name;
		int age;
		char gender;
		double weight;

		System.out.println("Enter the name:");
		name=s.next();

		System.out.println("age:");
		age=s.nextInt();

		System.out.println("Gender:");
		gender=s.next().charAt(0);

		System.out.println("Weight:");
		weight=s.nextDouble();
		
		System.out.println("OUTPUT");
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
		System.out.println(weight);
	}
}