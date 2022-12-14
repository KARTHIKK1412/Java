class kgm
{
	public static void main(String args[])
	{
		int a[]={5,7,2,4,9};
		int max=a[0];
		int min=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("Difference between the largest and smallest values of the said array:"+(max-min));
	}
}