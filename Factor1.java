//37. Write a Java program to find all factors of a number. 
import java.util.Scanner;
public class Factor1
{
 public static void main(String args[])
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("enter n value");
 int n=sc.nextInt();
 for(int i=1;i<=n/2;i++)
 {
 if(n%i==0)
 {
 System.out.print(i+" ");
 }
}
 }
}