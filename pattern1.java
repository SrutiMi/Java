import java.util.*;
public class pattern1{
    public static void main(String args[]){
        Scanner abc =new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int n= abc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
                }
            System.out.println();
        }
        abc.close();
    }
}