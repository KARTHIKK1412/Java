class kgm
{
	public static void main(String args[]){
	int a[]={77,77,65,65,65,77};
	int b=77;
	int c=65;
       String d="";
       String e="";
       
	for(int i=0;i<a.length;i++)
       {       
           for(int j=i+1;j<a.length;j++)
           { 
               if(a[i]==b)
               {
                   if(a[i]==a[j])
                   {
                         d="true";
                   }
                }
                if(a[i]==c)
                {
                    if(a[i]==a[j])
                    {
                           e="true";
                    }
                }
            }
        }

        if(d=="true"&&e=="true")
        {
                System.out.print("Result:"+"True");
        }
        else
        {
             System.out.print("Result:"+"False");
        }
    }
}