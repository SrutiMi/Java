import java.util.*;
public class inverted_half_pyramid {
    public static void inverted_pyramid(int n){
         for(int i=n;i>0;i--){
              for(int j=1;j<=i;j++){
                  System.out.print(j+" ");
              }
              System.out.println();
         }
    }
    public static void main(String args[]){
        Scanner abc=new Scanner(System.in);
        System.out.print("Enter the value of n :");
        int n=abc.nextInt();
        inverted_pyramid(n);
        abc.close();
    }
}
