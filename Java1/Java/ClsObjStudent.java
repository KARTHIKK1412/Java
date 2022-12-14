class Student
{
	int rollno =80020;
	
	String name="karthi";
	void display()
	{
		System.out.println("Roll no: "+rollno);
		System.out.println("Name: "+name);
	}
}
class MainDemo
{
	public static void main(String args[])
	{
		//Student obj=new Student();
		//obj.display();
		
		Student obj=new Student();
		obj.rollno=1123;
		obj.name="Karthi";
		obj.display();
	
		//System.out.println("Roll no: "+obj.rollno);
		//System.out.println("Name: "+obj.name);
			
	}
}