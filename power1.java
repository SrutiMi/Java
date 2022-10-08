public class power1 {
    public static void main(String args[]){
       System.out.print(optimizedPower(2,10));
    }
    public static int power(int x,int n){
        if(n==1){
            return x;
        }
        return x*power(x,n-1);
    }
    public static int optimizedPower(int x,int n){
            if(n==0){
                return 1;
            }
            int halfpowerSq=optimizedPower(x, n/2)*optimizedPower(x, n/2);
            if(n%2!=0){
                halfpowerSq*=x;
            }
            return halfpowerSq;
    }
}
