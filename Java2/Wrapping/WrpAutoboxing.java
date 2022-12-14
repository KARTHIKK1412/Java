class WrpAutobox
{
	public static void main (String args[])
	{
		int a=10;
		
		Integer b=Integer.valueOf(a);		//Manual
		
		Integer c=a;									//Autoboxing
		
		System.out.println("Primitive Datatype:"+a+ " Wrapper class: "+b+" ,"+c);
	}
}