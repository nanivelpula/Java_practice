import java.util.*;
class Palindro
  {
    public static void main(String[]args)
    {
      String str;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter any string:");
      str=sc.nextLine();
      String rev=new StringBuffer(str).reverse().toString();
      if(str.equals(rev))
        System.out.println("String is palindrome");
      else
        System.out.println("String is not palindrome");
    }
  }