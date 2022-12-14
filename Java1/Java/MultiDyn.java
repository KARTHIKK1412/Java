class MultiDyn
{
	public static void main(String k[])
	{
		int n[][]={{1,2,3,4},{1,2,3,4},{1,2,3,4},{1,5,3,4}};
		int row,col;

		for(row=0;row<4;row++)
		{
			for(col=0;col<4;col++)
			{
				System.out.print(n[row][col]+" ");
			}
			System.out.println();
		}
	}
}