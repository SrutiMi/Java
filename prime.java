public class prime {
    
    public static void main(String args[]){
         System.out.println(isprime(2));
    }
    public static boolean isprime(int n){
      for(int i=2;i<=n-1;i++){
       if(n!=2)
         if(n%2==0){
              return false ;
                        }
     
    }
    return true;
 }
}
