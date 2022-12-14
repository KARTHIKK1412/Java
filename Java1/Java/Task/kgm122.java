class kgm
{
	public static void main(String args[])
	{
		int a[]={25,14,56,15,36,56,77,18,29,49};
		int b=25;
		int c=77;

		for(int i=0;i<a.length;i++)
		{
			if(b==a[i])
			{
				System.out.println(i);
			}
			
			if(c==a[i])
			{
				System.out.println(i);
			}
		}
	}
}