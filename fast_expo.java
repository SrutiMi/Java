public class fast_expo {
    public static int expo(int n,int a){
        //here n is the power whch is converted into binary
        int ans=1;
        while(n>0){
             if((n&1)!=0){//checking the LSB 
                 ans=ans*a;
             }
             a=a*a;
             n=n>>1;
        }
        return ans;
    }
    public static void main(String args[]){
        System.out.print(expo(3,5));
    }
}
