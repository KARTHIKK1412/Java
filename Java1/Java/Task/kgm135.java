import java.util.*;
class kgm
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int days;
        System.out.print("Enter the number:");
        days=sc.nextInt();
        switch(days)
        {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Please enter number 1 to 7");
        }

    }    
}