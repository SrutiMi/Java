import java.util.*;
public class pattern2 {
    public static void main(String args[]){
       Scanner abc= new Scanner(System.in);
       System.out.print("Enter the value of n :");
       int n= abc.nextInt();
       int temp=n;
       for(int i=1;i<=n;i++){
        for(int j=temp;j>=1;j--){
            System.out.print("*");
        }
        temp--;
        System.out.println();
       }
       abc.close();
    }
}
