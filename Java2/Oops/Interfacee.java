interface Bike
{
	int speed=50;
	void run();
}

class Honda implements Bike
{
	public void run()
	{
		System.out.println(speed);
	}
}

class Inter
{
	public static void main(String args[])
	{
		Honda obj=new Honda();
		obj.run();
	}
}