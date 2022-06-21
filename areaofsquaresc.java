import java.util.Scanner;
 class areaofsquaresc {
   public static void main(String args[]){
      int l,area;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the length of the square ::");
      l = sc.nextInt();
      area = l*l;
      System.out.println("Area of the square is ::"+area);
   }
}