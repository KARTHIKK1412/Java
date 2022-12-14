class kgm
{
    public static void main(String args[])
    {
        int i=0;
        int num=0;
        String p=" ";
        int n=100;
        
        for(i=1;i<=n;i++)
        {
            int counter=0;
            for(num=i;num>=1;num--)
            {
                if(i%num==0)
					{
                		counter=counter+1;
					}
            }
        
       	 		if(counter==2)
        			{
            			p=p + i +" ";
					}
        }
        System.out.println(p);
    }
}