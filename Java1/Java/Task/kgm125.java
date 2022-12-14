class kgm
{
	public static void main(String args[])
	{
		int a[][]={{2,2},{3,3}};
		int b[][]={{3,3},{2,2}};
		int c[][]=new int[2][2];

		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print((c[i][j]=(a[i][j]+b[i][j]))+" ");
			}
		
		System.out.println();
		}
	}
}
		
	


