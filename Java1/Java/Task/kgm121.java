class kgm
{
	public static void main(String args[])
	{
		int a[]={35,5,55,15,99};
		int t;

		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
			}
		System.out.println(a[i]);
		}
	}
}