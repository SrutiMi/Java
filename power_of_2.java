public class power_of_2 {
    public static void main(String args[]){
       System.out.print(isPower(8));
    }
    public static boolean isPower(int n ){
        return (n&(n-1))==0;
    }
}
