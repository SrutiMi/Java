import java.util.*;
public class zero_one_triangle {
    public static void triangl(int num){
        for(int i=1;i<=num;i++){
              for(int j=1;j<=i;j++){
                  if((i+j)%2==0){
                      System.out.print("1 ");
                  }else{
                      System.out.print("0 ");
                  }
              }
              System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner abc=new Scanner(System.in);
        System.out.print("enter the value of n :");
        int n=abc.nextInt();
        triangl(n);
        abc.close();
    }
}
