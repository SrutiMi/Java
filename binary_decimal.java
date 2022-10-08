import java.util.*;
public class binary_decimal {
    public static void main(String args[]){
        int dig=0,j=0,i=0;
        Scanner abc=new Scanner(System.in);
        System.out.print("Enter the binary number :");
        int n =abc.nextInt();
        
        while(n>0){
            dig=n%10;
            j+=dig*(int)Math.pow(2,i);
            i++;
            n/=10;
        }
        System.out.println("The decimal equivalent is : "+j);
        abc.close();
    }
}
