class Student
{
	int studentId=1001;
	String name="Arun J";
	void output()
	{
		System.out.println("Student ID: "+studentId);
		System.out.println("Student Name: "+name);
	}
}

class kgm
{
	public static void main(String args[])
	{
		Student st=new Student();
		st.output();
	}
}