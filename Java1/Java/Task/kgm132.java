class overload
{
    String name;
    String talk(String n)
    {
		name=n;
		return(name);
    }
}
class kgm
{
    public static void main(String args[])
    {
    	overload ob=new overload();
    	ob.talk("hello");
    	System.out.print(ob.name);
    }
}

/*void talk(String name)
{
	System.out.println(name);
}*/