import java.util.Scanner;
class areaoftrianglesc  
{
   public static void main(String args[])
  {   
      Scanner sc = new Sc(System.in);

      System.out.println("Enter the width of the Triangle:");
      int base = sc.nextInt();

      System.out.println("Enter the height of the Triangle:");
      int height = sc.nextInt();
      int area = (base* height)/2;
      System.out.println("Area of Triangle is: " + area);      
   }
}