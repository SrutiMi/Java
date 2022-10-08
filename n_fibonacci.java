public class n_fibonacci {
    public static void main(String args[]){
        System.out.print(fibo(6));
    }
    public static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        int fib1=fibo(n-1);
        int fib2=fibo(n-2);
        int f=fib1+fib2;
        return f;
    }
}
