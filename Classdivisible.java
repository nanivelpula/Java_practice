import java.util.*;
public class Classdivisible
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number to check it is divisible by 5 and 11:");
        int number=sc.nextInt();
        if((number%5==0)&&(number%11==0))
        {
            System.out.println("Given number "+ number + " is Divisible by 5 and 11");
        } 
        else
        {
            System.out.println("Given number "+ number + " is Not Divisible by 5 and 11");
        }
    }
}