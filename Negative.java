//50. Write a Java program to print all negative elements in an array. 
public class Negative {
public static void main(String[] args) {
int j = 0;
int[] Neg_arr = {-40, 15, -4, 11, -8, -13, 22, 16, -11, -99, 55, 18, -60};
System.out.print("\nList of Negative Numbers in NEG Array : ");
while(j < Neg_arr.length) 
{
if(Neg_arr[j] < 0) {
System.out.format("%d ", Neg_arr[j]);
}
j++;
}
}
}
