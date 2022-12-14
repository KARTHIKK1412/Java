class rect
{
	static int a=12;
	static int b=13;
	static void output()
	{
		System.out.println("Rectangle:"+(a*b));
	}
}

class rhombus
{
	static double c=20.3;
	static double d=30.5;
	static void display()
	{
		System.out.println("Rhombus:"+((c*d)/2));
	}
}

class kgm
{
	public static void main(String args[])
	{
		rect.output();
		rhombus.display();
	}
}