class Employee
{
	int salary=40000;
	void emp()			//method
	{
		System.out.println("Programmer salary:"+salary);
	}
}

class Programmer extends Employee
{
	int bonus=12000;
	void cal()
	{
		int cal=bonus+salary;
		emp();
		System.out.println("Programmer bonus="+bonus);	
		System.out.println("Total amt="+cal);
	}
}

class InherSingle
{
	public static void main(String args[])
	{
		Programmer p=new Programmer();
		p.cal();
	}
}