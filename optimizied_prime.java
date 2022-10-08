public class optimizied_prime {
    public static void main(String args[]){
        System.out.println(isprime(31));
    }
    public static boolean isprime(int n){
        for(int i=2;i<=(int)Math.sqrt(n);i++){
            if(n!=2)
              if(n%2==0)
                return false;
        }
        return true;
    }
}
