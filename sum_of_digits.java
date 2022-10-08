public class sum_of_digits {
    public static void sod(int num){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        System.out.print(sum);
    }
    public static void main(String args[]){
        sod(8);
    }
}
