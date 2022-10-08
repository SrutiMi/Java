import java.util.*;
public class flyod_triangle {
    public static void floyd(int n){
        int count=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner abc=new Scanner(System.in);
        System.out.print("n = ");
        int n=abc.nextInt();
        floyd(n);
        abc.close();
    }
}
