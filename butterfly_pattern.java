import java.util.*;
public class butterfly_pattern {
    public static void butterfly(int n){
        //for 1st half
        for(int i=1;i<=n;i++){
            //stars
            for(int star=1;star<=i;star++){
                System.out.print("*");
             }
            //spaces
            for(int sp=1;sp<=2*(n-i);sp++){
                System.out.print(" ");
            }
            //stars
            for(int star=1;star<=i;star++){
                System.out.print("*");
             }
            System.out.println();
            }
        //for 2nd half
        for(int i=n;i>0;i--){
            //stars
            for(int star=1;star<=i;star++){
                System.out.print("*");
             }
            //spaces
            for(int sp=1;sp<=2*(n-i);sp++){
                System.out.print(" ");
            }
            //stars
            for(int star=1;star<=i;star++){
                System.out.print("*");
             }
             System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner abc=new Scanner(System.in);
        System.out.print("Enter the value of n");
        int n =abc.nextInt();
        butterfly(n);
        abc.close();
    }
}
