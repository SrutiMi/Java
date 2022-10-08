import java.util.*;
public class solid_rhombus {
    public static void rhombus(int n){
        for(int i=1;i<=n;i++){
            for(int sp=1;sp<=n-i;sp++){
                System.out.print(" ");
            }
            for(int stars=1;stars<=n;stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner abc=new Scanner(System.in);
        System.out.print("Enter the value of n :");
        int n=abc.nextInt();
        rhombus(n);
        abc.close();
    }
}
