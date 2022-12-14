abstract class Bike
{
	abstract void run();		//Showing the functionally
}

class Honda extends Bike
{
	void run()		//Background details
	{
		System.out.println("The Milege of Honda:70KM");
	}
}

class AbstractHonda
{
	public static void main(String args[])
	{
		Honda obj=new Honda();
		obj.run();
	}
}


