//54. Write a Java program to count total number of negative elements in an array. 
public class CountNegative{
public static void main(String[] args) {
int i = 0, count = 0;
int[] count_NegArr = {-40, 15, -4, 11, -8, -13, 22, 16, -11, -99, 55, 18, -
60};
while(i < count_NegArr.length) 
{
if(count_NegArr[i] < 0) {
count++;
}
i++;
}
System.out.println("\nThe Total Number of Negative Array Items = " + 
count);
}
}
