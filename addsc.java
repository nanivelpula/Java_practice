import java.util.Scanner; 

class addsc {
  public static void main(String[] args) {
    int a,b,c;
    Scanner sc = new Scanner(System.in); 
    System.out.println("enter a number:");
    a= sc.nextInt(); 

    System.out.println("enter a number:");
    b= sc.nextInt(); 

    c = a+b;  
    System.out.println("Sum is: " + c); 
  }
}
