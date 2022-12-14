import java.util.*;
class Markss
{
	public static void main(String mk[])
	{
		Scanner s=new Scanner(System.in);

		String name;
		int Rollno,html,css,javaa,total;
		
		double per;

		System.out.print("Enter the name:");
		name=s.next();

		System.out.print("Roll no:");
		Rollno=s.nextInt();
	
		System.out.print("HTML:");
		html=s.nextInt();
	
		System.out.print("CSS:");
		css=s.nextInt();
	
		System.out.print("JAVA:");
		javaa=s.nextInt();
	
		

		System.out.println("---------------------------------------------");
		System.out.println("           MARKSHEET");
		System.out.println("---------------------------------------------");

		
		System.out.println("Name:"+name);
		System.out.println("Roll no:"+Rollno);
		System.out.println("HTML:"+html);
		System.out.println("CSS:"+css);
		System.out.println("JAVA:"+javaa);
		System.out.println("---------------------------------------------");
		
		total=html+css+javaa;
		System.out.println("TOTAL:"+total);
		
		per=total/3;
		System.out.println("Percentage:"+per);

		if
	}
}