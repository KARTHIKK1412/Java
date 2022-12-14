class StArray
{
	public static void main(String[] args)
	{
		int i,a[]={10,55,99,1,4,56};
		int sum=0;
		
		for(i=0;i<6;i++)
		{
			System.out.println("Array position/index:" +i+ "   Array value:"+a[i]);

			sum=sum+a[i];
		}
		
		System.out.println("Sum of these number:"+sum);
		System.out.println("Average of these number:"+sum/6);

		System.out.println("Reverse Order:");
	
		for(i=5;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}
}
