import java.util.Scanner;
class PrimeNum
{
	public static void main (String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i;
		int num=0;
		//Empty string
		String pn=" ";
		System.out.println("Enter tha value of a:");
		int n=sc.nextInt();
		sc.close();
		
		for(i=1;i<=n;i++)
			{
				int counter=0;
				
				for(num=i;num>=1;num--)
				{
					if(i%num==0)
					{
						counter=counter + 1;
					}
				}
				if(counter==2)
				{

					pn=pn+i+""+"\n";			//Appended the Prime number to the String
					
				}
			}
			
		System.out.println("Prime number from 1 to n are:");
		System.out.println(pn);
		
	}
}