import java.util.*;
public class hollow_rhombus {
    public static void hollow(int n){
        for(int i=1;i<=n;i++){
             for(int sp=1;sp<=n-i;sp++){
                System.out.print(" ");
             }
             for(int j=1;j<=n;j++){
                if(i==1||i==n||j==1||j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
             }
             System.out.println();
        }
        
        
    }
    public static void main(String args[]){
        Scanner abc=new Scanner(System.in);
         System.out.print("Enter the value of n :");
         int n=abc.nextInt();
         hollow(n);
         abc.close();

    }
}
