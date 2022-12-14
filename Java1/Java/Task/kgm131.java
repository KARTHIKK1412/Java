class student
{
    int inp;
    String name;
    int mark1,mark2,mark3;
    student(int i,String n,int m1,int m2,int m3)
    {
        inp=i;
        name=n;
        mark1=m1;
        mark2=m2;
        mark3=m3;
    }

    void display()
	{ 
       System.out.println("StudentID:"+inp);
       System.out.println("Student Name:"+name);
       System.out.println("m1="+mark1);
       System.out.println("m2="+mark2);
       System.out.println("m2="+mark3);
       System.out.println("Total="+((mark1+mark2+mark3)));
       System.out.println("Percentage="+((mark1+mark2+mark3)/3));
       System.out.println("Grade=O");
    }
}

class kgm
{
    public static void main(String args[])
	{
        student ob=new student(1001,"Arun.M",95,95,98);
        ob.display();  
    }
}
