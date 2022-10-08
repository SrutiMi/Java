import java.util.*;
public class binomial_coefficient {
    public static void main(String args[]){
        Scanner abc=new Scanner(System.in);
        System.out.println(" n= ");
        int n=abc.nextInt();
        System.out.println(" r= ");
        int r=abc.nextInt();
        System.out.println("The binomial coefficient is :" +binomial(n,r));
        abc.close();
    }
    public static float binomial(int n,int r){
        float bino=0.0f;
        bino=(factorial(n))/(factorial(r)*factorial(n-r));
        return bino;
    }
    public static int factorial(int n){
        int factorial=1;
        for(int i=1;i<=n;i++){
            factorial*=i;
        }
        return factorial;
    }
}
