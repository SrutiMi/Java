import java.util.*;
public class product {
    public static void main(String args[]){
    Scanner abc =new Scanner(System.in);
    System.out.println("Enter the first number :");
    int a =abc.nextInt();
    System.out.println("Enter the second number :");
    int b= abc.nextInt();
    int product=a*b;
    System.out.println("The product is "+product); 
    abc.close();//this we have used to close the scanner otherwise it is showing resource overflow
   }
}
