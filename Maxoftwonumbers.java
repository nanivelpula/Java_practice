write a program to find maximum between two numbers.
import java.util.*;
public class Maxoftwonumbers
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1=sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2=sc.nextInt();
        if(num1>num2)
        System.out.println("number one is maximum");
        else
        System.out.println("number two is maximum");
    }
}