class Fibonacci
{
	int i,a=0,b=1,c;
	void fib()
	{
		for(i=0;i<10;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
		}
	}
}

class kgm
{
	public static void main(String args[])
	{
		Fibonacci fi=new Fibonacci();
		fi.fib();
	}
}
