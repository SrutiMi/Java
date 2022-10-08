import java.util.*;
public class multiply{
    public static void main(String arg[]){
        Scanner abc =new Scanner(System.in);
        System.out.print("Enter the value of the first number :");
        int a= abc.nextInt();
        System.out.print("Enter the value of the first number :");
        int b= abc.nextInt();
        System.out.println("The product is :" +(product(a,b)));
        abc.close();
    }
    public static int product(int a,int b){
          return (a*b);
    }
}