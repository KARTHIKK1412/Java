import java.util.*;
class DynSorting
{
	public static void main(String k[])
	{
		Scanner sc= new Scanner(System.in);
		int a[]=new int[20];		
		int size,i,j,t;
		
		System.out.println("Enter the size upto 20:");
		size=sc.nextInt();

		System.out.println("Enter the element one by one:");
		
		for(i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(i=0;i<=size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(a[i]<a[j])
				{
					  t  =a[i];
					a[i] =a[j];
					a[j] =t;
				}
			}				
		}

			
		System.out.println("After sorting elements:");	
		for(i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
	}
}
