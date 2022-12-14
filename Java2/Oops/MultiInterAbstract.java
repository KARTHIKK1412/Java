interface Cricket
{
	void players();
}

interface Volleyball
{
	void players1();
}

class Games implements Cricket,Volleyball
{
	public void players()
	{
		System.out.println("No of players in Cricket:11");
	}

	public void players1()
	{
		System.out.println("No of players in Volleyball:6");
	}
}

class Multi
{
	public static void main(String args[])
	{
		Games obj=new Games();
		obj.players();
		obj.players1();
	}
}

