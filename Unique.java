import java.util.*;
public class Unique{
   public static void main (String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter no of elements");
      int x = sc.nextInt();
      int arr[] = new int[x];
      int n = arr.length;
      int i, j;
      System.out.print("The array is: ");
      for (i = 0; i < n; ++i){
          arr[i] = sc.nextInt(); 
      }
      System.out.print("\nThe unique elements of above array are: ");
      for (i = 0; i < n; i++) {
         for (j = 0; j < i; j++)
         if (arr[i] == arr[j])
            break;
         if (i == j)
         System.out.print( arr[i] + " ");
      }
   }
}