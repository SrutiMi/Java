import java.util.*;
public class diamond {
    public static void dia(int n){
        //for 1st half
        for(int i=1;i<=n;i++){
              for(int sp=1;sp<=n-i;sp++){
                  System.out.print(" ");
              }
              for(int j=1;j<=2*i-1;j++){
                  System.out.print("*");
              }
              System.out.println();
        }
        //for 2nd half
        for(int i=n;i>0;i--){
            for(int sp=1;sp<=n-i;sp++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
      }
    }
    public static void main(String args[]){
        Scanner abc=new Scanner(System.in);
        System.out.print("n = ");
        int n=abc.nextInt();
        dia(n);
        abc.close();
    }
}
