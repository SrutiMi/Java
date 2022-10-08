import java.util.*;
public class prime_in_range {
    public static void main(String args[]){
        Scanner abc=new Scanner(System.in);
        System.out.print("Enter the range :");
        int n= abc.nextInt();
        for(int i=2;i<=n;i++){
            if(isprime(i)){
                System.out.print(i+" , ");
            }
        }
        abc.close();
    }
    public static boolean isprime(int n){
        for(int i=2;i<=n-1;i++){
         if(n!=2)
           if(n%i==0){
                return false ;
                          }
       
      }
      return true;
   }
}
